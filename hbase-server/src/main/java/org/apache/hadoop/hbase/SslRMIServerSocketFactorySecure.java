/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable
 * law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 * for the specific language governing permissions and limitations under the License.
 */
package org.apache.hadoop.hbase;

import org.apache.hadoop.hbase.util.SslProtocolsUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.rmi.ssl.SslRMIServerSocketFactory;

/**
 * Avoid SSL V3.0 "Poodle" Vulnerability - CVE-2014-3566
 */
public class SslRMIServerSocketFactorySecure extends SslRMIServerSocketFactory {
  // If you add more constructors, you may have to change the rest of this implementation,
  // which assumes an empty constructor, i.e. there are no specially enabled protocols or
  // cipher suites on this RMI factory nor a provided SSLContext
  public SslRMIServerSocketFactorySecure() {
    super();
  }

  @Override
  public ServerSocket createServerSocket(int port) throws IOException {
    return new ServerSocket(port) {
      public Socket accept() throws IOException {
        Socket socket = super.accept();
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket sslSocket =
            (SSLSocket) sslSocketFactory.createSocket(socket,
              socket.getInetAddress().getHostName(), socket.getPort(), true);
        sslSocket.setUseClientMode(false);
        sslSocket.setNeedClientAuth(false);

        sslSocket.setEnabledProtocols(SslProtocolsUtil.getEnabledSslProtocols());

        return sslSocket;
      }
    };
  }
}
