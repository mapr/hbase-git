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
#ifndef HBASE_TESTS_OPS_RUNNER_H_
#define HBASE_TESTS_OPS_RUNNER_H_

#include <pthread.h>
#include <hbase/hbase.h>

#include "test_types.h"
#include "byte_buffer.h"
#include "key_gen.h"
#include "stats_keeper.h"

namespace hbase {
namespace test {

class OpsRunner : public TaskRunner {
public:
  OpsRunner(
      const hb_client_t client,
      const bytebuffer table,
      const bool load,
      const uint32_t putPercent,
      const uint64_t startRow,
      const uint64_t numOps,
      const bytebuffer *families,
      const uint32_t numFamilies,
      const bytebuffer *columns,
      const uint32_t numColumns,
      const char *keyPrefix,
      const int valueSize,
      const bool hashKeys,
      const bool bufferPuts,
      const bool writeToWAL,
      int32_t maxPendingRPCsPerThread,
      const bool checkRead,
      StatKeeper *statKeeper,
      KeyGenerator *keyGenerator,
      const bool scanOnly,
      const uint32_t maxRowsPerScan,
      const uint32_t resumeThreshold) :
        client_(client),
        table_ (table),
        load_(load),
        startRow_(startRow),
        numOps_(numOps),
        hashKeys_(hashKeys),
        bufferPuts_(bufferPuts),
        writeToWAL_(writeToWAL),
        families_(families),
        numFamilies_(numFamilies),
        columns_(columns),
        numColumns_(numColumns),
        keyPrefix_(keyPrefix),
        valueLen_(valueSize),
        getsSent_(0),
        maxGets_(numOps_*(1.0-(putPercent/100.0))),
        putsSent_(0),
        maxPuts_(numOps_-maxGets_),
        putWeight_(putPercent/100.0),
        checkRead_(checkRead),
        paused_(false),
        semaphore_(new Semaphore(maxPendingRPCsPerThread)),
        statKeeper_(statKeeper),
        keyGenerator_(keyGenerator),
        scanOnly_(scanOnly),
        scanNumRowsGenerator_(1, maxRowsPerScan),
        resumeThreshold_(resumeThreshold) {
    pthread_mutex_init(&pauseMutex_, 0);
    pthread_cond_init(&pauseCond_, 0);
  }

  ~OpsRunner() {
    delete semaphore_;
  }

protected:
  const hb_client_t client_;
  const bytebuffer table_;
  const bool load_;
  const uint64_t startRow_;
  const uint64_t numOps_;
  const bool hashKeys_;
  const bool bufferPuts_;
  const bool writeToWAL_;
  const bytebuffer *families_;
  const uint32_t numFamilies_;
  const bytebuffer *columns_;
  const uint32_t numColumns_;
  const char *keyPrefix_;
  const int valueLen_;

  uint64_t getsSent_;
  const uint64_t maxGets_;
  uint64_t putsSent_;
  const uint64_t maxPuts_;
  const double putWeight_;
  const bool checkRead_;

  volatile bool paused_;
  pthread_mutex_t pauseMutex_;
  pthread_cond_t pauseCond_;

  Semaphore *const semaphore_;

  StatKeeper *statKeeper_;

  KeyGenerator *keyGenerator_;

  bool scanOnly_;

  UniformKeyGenerator scanNumRowsGenerator_;

  uint32_t resumeThreshold_;

  uint32_t numSemsAcquiredOnPause_;
  void *Run();

  void SendPut(uint64_t row);

  void BeginRpc();

  void EndRpc(int32_t err, bytebuffer key, StatKeeper::OpType type);

  void Pause();

  void Resume();

  void WaitForCompletion();

  void SendGet(uint64_t row);

  void SendScan(uint64_t row);

  static void PutCallback(int32_t err, hb_client_t client,
      hb_mutation_t mutation, hb_result_t result, void *extra);

  static void GetCallback(int32_t err, hb_client_t client,
      hb_get_t get, hb_result_t result, void *extra);

  static void ScanCallback(int32_t err, hb_scanner_t scanner,
      hb_result_t *results, size_t numResults, void *extra);
};

} /* namespace test */
} /* namespace hbase */

#endif /* HBASE_TESTS_OPS_RUNNER_H_ */
