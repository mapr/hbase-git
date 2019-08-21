#!/usr/bin/env bash
#
#/**
# * Copyright The Apache Software Foundation
# *
# * Licensed to the Apache Software Foundation (ASF) under one
# * or more contributor license agreements.  See the NOTICE file
# * distributed with this work for additional information
# * regarding copyright ownership.  The ASF licenses this file
# * to you under the Apache License, Version 2.0 (the
# * "License"); you may not use this file except in compliance
# * with the License.  You may obtain a copy of the License at
# *
# *     http://www.apache.org/licenses/LICENSE-2.0
# *
# * Unless required by applicable law or agreed to in writing, software
# * distributed under the License is distributed on an "AS IS" BASIS,
# * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# * See the License for the specific language governing permissions and
# * limitations under the License.
# */

BASE_MAPR=${MAPR_HOME:-/opt/mapr}
MAPR_CONF="${BASE_MAPR}/conf"

# Source env.sh from MapR distribution
env=${BASE_MAPR}/conf/env.sh
[ -f $env ] && . $env

MAPR_LOGIN_CONF=${MAPR_LOGIN_CONF:-${BASE_MAPR}/conf/mapr.login.conf}
MAPR_CLUSTERS_CONF=${MAPR_CLUSTERS_CONF:-${BASE_MAPR}/conf/mapr-clusters.conf}
SSL_TRUST_STORE=${SSL_TRUST_STORE:-${BASE_MAPR}/conf/ssl_truststore}

# Set the user if not set in the environment
if [ "$HBASE_IDENT_STRING" == "" ]; then
  HBASE_IDENT_STRING=`id -nu`
fi

# Dump heap on OOM
HBASE_OPTS="$HBASE_OPTS -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/cores/"

# Add MapR file system and dependency jars. There are two sets of such jars
# First set which override those found in HBase' lib folder, and is prepended
# to the CLASSPATH while the second set is appended to HBase' classpath.

# First set
# JARs in ${BASE_MAPR}/lib
MAPR_JARS="zookeeper-3.4*.jar"
for jar in ${MAPR_JARS}; do
  JARS=`echo $(ls ${BASE_MAPR}/lib/${jar} 2> /dev/null) | sed 's/\s\+/:/g'`
  if [ "${JARS}" != "" ]; then
    HBASE_MAPR_OVERRIDE_JARS=${HBASE_MAPR_OVERRIDE_JARS}:${JARS}
  fi
done
# Remove any additional ':' from the tail
HBASE_MAPR_OVERRIDE_JARS="${HBASE_MAPR_OVERRIDE_JARS#:}"

# Second set
# JARs in ${BASE_MAPR}/lib
MAPR_JARS="libprotodefs*.jar baseutils*.jar JPam-*.jar"
for jar in ${MAPR_JARS}; do
  JARS=`echo $(ls ${BASE_MAPR}/lib/${jar} 2> /dev/null) | sed 's/\s\+/:/g'`
  if [ "${JARS}" != "" ]; then
    HBASE_MAPR_EXTRA_JARS=${HBASE_MAPR_EXTRA_JARS}:${JARS}
  fi
done
# Remove any additional ':' from the tail
HBASE_MAPR_EXTRA_JARS="${HBASE_MAPR_EXTRA_JARS#:}"

export HBASE_OPTS HBASE_MAPR_OVERRIDE_JARS HBASE_MAPR_EXTRA_JARS HBASE_IDENT_STRING

# Configure secure options
if [ -z "${MAPR_SECURITY_STATUS}" -a -r "${MAPR_CLUSTERS_CONF}" ]; then
    MAPR_SECURITY_STATUS=$(head -n 1 ${MAPR_CLUSTERS_CONF} | grep secure= | sed 's/^.*secure=//' | sed 's/ .*$//')
fi

MAPR_JAAS_CONFIG_OPTS=${MAPR_JAAS_CONFIG_OPTS:-"-Djava.security.auth.login.config=${MAPR_LOGIN_CONF}"}

if [ "$MAPR_SECURITY_STATUS" = "true" ]; then
    MAPR_ZOOKEEPER_OPTS=${MAPR_ZOOKEEPER_OPTS:-"-Dzookeeper.saslprovider=com.mapr.security.maprsasl.MaprSaslProvider"}
    MAPR_ZOOKEEPER_OPTS="${MAPR_ZOOKEEPER_OPTS} -Dzookeeper.sasl.client=true"
    if (cat "$MAPR_CLUSTERS_CONF" | grep -q "kerberosEnable=true"); then
        MAPR_HBASE_SERVER_OPTS="-Dhadoop.login=kerberos_keytab"
        MAPR_HBASE_CLIENT_OPTS="-Dhadoop.login=kerberos"
    else
        MAPR_HBASE_SERVER_OPTS="-Dhadoop.login=maprsasl_keytab"
        MAPR_HBASE_CLIENT_OPTS="-Dhadoop.login=maprsasl"
    fi
    MAPR_SSL_OPTS=${MAPR_SSL_OPTS:-"-Djavax.net.ssl.trustStore=${SSL_TRUST_STORE}"}
else
    MAPR_ZOOKEEPER_OPTS=${MAPR_ZOOKEEPER_OPTS:-"-Dzookeeper.sasl.clientconfig=Client_simple -Dzookeeper.saslprovider=com.mapr.security.simplesasl.SimpleSaslProvider"}
    MAPR_HBASE_SERVER_OPTS="-Dhadoop.login=simple"
    MAPR_HBASE_CLIENT_OPTS="-Dhadoop.login=simple"
fi

export MAPR_HBASE_SERVER_OPTS="${MAPR_HBASE_SERVER_OPTS} ${MAPR_JAAS_CONFIG_OPTS} ${MAPR_ZOOKEEPER_OPTS} ${MAPR_SSL_OPTS} -Dmapr.library.flatclass"
export MAPR_HBASE_CLIENT_OPTS="${MAPR_HBASE_CLIENT_OPTS} ${MAPR_JAAS_CONFIG_OPTS} ${MAPR_ZOOKEEPER_OPTS} ${MAPR_SSL_OPTS} -Dmapr.library.flatclass"

HBASE_JMX_BASE="-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.ssl=false"
if [ "$MAPR_SECURITY_STATUS" = "true" ]; then
    HBASE_JMX_BASE="${HBASE_JMX_BASE} -Dcom.sun.management.jmxremote.authenticate=true \
    -Dcom.sun.management.jmxremote.password.file=${MAPR_CONF}/jmxremote.password \
    -Dcom.sun.management.jmxremote.access.file=${MAPR_CONF}/jmxremote.access"
else
    HBASE_JMX_BASE="${HBASE_JMX_BASE} -Dcom.sun.management.jmxremote.authenticate=false"
fi
export HBASE_MASTER_OPTS="$HBASE_MASTER_OPTS $HBASE_JMX_BASE -Dcom.sun.management.jmxremote.port=10101"
export HBASE_REGIONSERVER_OPTS="$HBASE_REGIONSERVER_OPTS $HBASE_JMX_BASE -Dcom.sun.management.jmxremote.port=10102"
export HBASE_THRIFT_OPTS="$HBASE_THRIFT_OPTS $HBASE_JMX_BASE -Dcom.sun.management.jmxremote.port=10103"
export HBASE_REST_OPTS="$HBASE_REST_OPTS $HBASE_JMX_BASE -Dcom.sun.management.jmxremote.port=10104"
