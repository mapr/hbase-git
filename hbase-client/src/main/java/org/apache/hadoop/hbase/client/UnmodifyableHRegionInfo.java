/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.client;

import org.apache.hadoop.hbase.classification.InterfaceAudience;
import org.apache.hadoop.hbase.classification.InterfaceStability;
import org.apache.hadoop.hbase.HRegionInfo;

@InterfaceAudience.Public
@InterfaceStability.Evolving
class UnmodifyableHRegionInfo extends HRegionInfo {
  /*
   * Creates an unmodifyable copy of an HRegionInfo
   *
   * @param info
   */
  public UnmodifyableHRegionInfo(HRegionInfo info) {
    super(info);
  }

  /**
   * @param split set split status
   */
  @Override
  public void setSplit(boolean split) {
    throw new UnsupportedOperationException("HRegionInfo is read-only");
  }

  /**
   * @param offLine set online - offline status
   */
  @Override
  public void setOffline(boolean offLine) {
    throw new UnsupportedOperationException("HRegionInfo is read-only");
  }
}
