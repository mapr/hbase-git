#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

module Shell
  module Commands
    class SetPerm < Command
      def help
        return <<-EOF
Set access control permissions on a MapR table/column family/column qualifier.
Syntax 1 : set_perm <table path>, <permission>, <expression>
Syntax 2 : set_perm <table path>, {COLUMN => "column family[:qualifier]", PERM => "<permission>", EXPR => "<expression>"}
Examples:
  hbase> set_perm "/user/finance/payroll", "adminaccessperm", "g:managers"
  hbase> set_perm "/user/finance/payroll", {COLUMN => "info", PERM => "compressionperm", EXPR => "u:alice"}
  hbase> set_perm "/user/finance/payroll", {COLUMN => "info:bonus", PERM => "writeperm", EXPR => "u:bob | u:carol | g:managers"}

Available permissions:
#{com.mapr.baseutils.utils.AceHelper::getPermissionsListForShellHelp}

This command is not applicable for Apache HBase tables.
EOF
      end

      def command(table_path, *args)
        format_simple_command do
          mapr_admin.set_perm(table_path, *args)
        end
      end
    end
  end
end
