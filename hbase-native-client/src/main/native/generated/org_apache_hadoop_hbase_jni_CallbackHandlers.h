/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements. See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership. The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_apache_hadoop_hbase_jni_CallbackHandlers */

#ifndef _Included_org_apache_hadoop_hbase_jni_CallbackHandlers
#define _Included_org_apache_hadoop_hbase_jni_CallbackHandlers
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_apache_hadoop_hbase_jni_CallbackHandlers
 * Method:    mutationCallBack
 * Signature: (Ljava/lang/Throwable;JJJLjava/lang/Object;J)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_hbase_jni_CallbackHandlers_mutationCallBack
  (JNIEnv *, jclass, jthrowable, jlong, jlong, jlong, jobject, jlong);

/*
 * Class:     org_apache_hadoop_hbase_jni_CallbackHandlers
 * Method:    getCallBack
 * Signature: (Ljava/lang/Throwable;JJJLjava/lang/Object;J)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_hbase_jni_CallbackHandlers_getCallBack
  (JNIEnv *, jclass, jthrowable, jlong, jlong, jlong, jobject, jlong);

/*
 * Class:     org_apache_hadoop_hbase_jni_CallbackHandlers
 * Method:    clientFlushCallBack
 * Signature: (Ljava/lang/Throwable;JJJ)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_hbase_jni_CallbackHandlers_clientFlushCallBack
  (JNIEnv *, jclass, jthrowable, jlong, jlong, jlong);

/*
 * Class:     org_apache_hadoop_hbase_jni_CallbackHandlers
 * Method:    clientCloseCallBack
 * Signature: (Ljava/lang/Throwable;JJJ)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_hbase_jni_CallbackHandlers_clientCloseCallBack
  (JNIEnv *, jclass, jthrowable, jlong, jlong, jlong);

/*
 * Class:     org_apache_hadoop_hbase_jni_CallbackHandlers
 * Method:    scannerCloseCallBack
 * Signature: (Ljava/lang/Throwable;JJJ)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_hbase_jni_CallbackHandlers_scannerCloseCallBack
  (JNIEnv *, jclass, jthrowable, jlong, jlong, jlong);

/*
 * Class:     org_apache_hadoop_hbase_jni_CallbackHandlers
 * Method:    scanNextCallBack
 * Signature: (Ljava/lang/Throwable;JJ[Ljava/lang/Object;IJ)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_hbase_jni_CallbackHandlers_scanNextCallBack
  (JNIEnv *, jclass, jthrowable, jlong, jlong, jobjectArray, jint, jlong);

#ifdef __cplusplus
}
#endif
#endif
