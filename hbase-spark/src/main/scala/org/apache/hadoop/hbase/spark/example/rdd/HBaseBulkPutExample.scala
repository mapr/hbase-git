/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.spark.example.rdd

import org.apache.hadoop.hbase.client.Put
import org.apache.hadoop.hbase.spark.HBaseContext
import org.apache.hadoop.hbase.spark.HBaseRDDFunctions._
import org.apache.hadoop.hbase.util.Bytes._
import org.apache.hadoop.hbase.{HBaseConfiguration, TableName}
import org.apache.spark.{SparkConf, SparkContext}

/**
 * This is a simple example of putting records in HBase
 * with the bulkPut function.
 */
object HBaseBulkPutExample {
   def main(args: Array[String]) {
     if (args.length < 2) {
       println("HBaseBulkPutExample {tableName} {columnFamily}")
       return
     }

     val tableName = args(0)
     val columnFamily = args(1)

     val sparkConf = new SparkConf().setAppName("HBaseBulkPutExample " +
       tableName + " " + columnFamily)
     val sc = new SparkContext(sparkConf)

     try {
       //[(Array[Byte], Array[(Array[Byte], Array[Byte], Array[Byte])])]
       val rdd = sc.parallelize(Array(
         (toBytes("1"),
           Array((toBytes(columnFamily), toBytes("1"), toBytes("1")))),
         (toBytes("2"),
           Array((toBytes(columnFamily), toBytes("1"), toBytes("2")))),
         (toBytes("3"),
           Array((toBytes(columnFamily), toBytes("1"), toBytes("3")))),
         (toBytes("4"),
           Array((toBytes(columnFamily), toBytes("1"), toBytes("4")))),
         (toBytes("5"),
           Array((toBytes(columnFamily), toBytes("1"), toBytes("5"))))
       ))

       val conf = HBaseConfiguration.create()

       val hbaseContext = new HBaseContext(sc, conf)

       rdd.hbaseBulkPut(hbaseContext, TableName.valueOf(tableName),
         (putRecord) => {
           val put = new Put(putRecord._1)
           putRecord._2.foreach((putValue) => put.addColumn(putValue._1, putValue._2,
             putValue._3))
           put
         })

     } finally {
       sc.stop()
     }
   }
 }