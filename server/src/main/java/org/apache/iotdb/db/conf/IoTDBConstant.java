/*
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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.iotdb.db.conf;

public class IoTDBConstant {

  private IoTDBConstant() {
  }

  public static final String ENV_FILE_NAME = "iotdb-env";
  public static final String IOTDB_CONF = "IOTDB_CONF";
  public static final String GLOBAL_DB_NAME = "IoTDB";
  //when running the program in IDE, we can not get the version info using getImplementationVersion()
  public static final String VERSION =
      IoTDBConstant.class.getPackage().getImplementationVersion() != null ? IoTDBConstant.class
          .getPackage().getImplementationVersion() : "UNKNOWN";

  public static final String AUDIT_LOGGER_NAME = "IoTDB_AUDIT_LOGGER";

  public static final String IOTDB_JMX_PORT = "iotdb.jmx.port";

  public static final String IOTDB_PACKAGE = "org.apache.iotdb.service";
  public static final String JMX_TYPE = "type";

  public static final long GB = 1024 * 1024 * 1024L;
  public static final long MB = 1024 * 1024L;
  public static final long KB = 1024L;

  public static final String IOTDB_HOME = "IOTDB_HOME";

  public static final String SEQFILE_LOG_NODE_SUFFIX = "-seq";
  public static final String UNSEQFILE_LOG_NODE_SUFFIX = "-unseq";

  public static final String PATH_ROOT = "root";
  public static final char PATH_SEPARATOR = '.';
  public static final String ADMIN_NAME = "root";
  public static final String ADMIN_PW = "root";
  public static final String PROFILE_SUFFIX = ".profile";
  public static final String MAX_TIME = "max_time";
  public static final String MIN_TIME = "min_time";
  public static final String LAST_VALUE = "last_value";
  public static final int MIN_SUPPORTED_JDK_VERSION = 8;

  // show info
  public static final String COLUMN_ITEM = "                             item";
  public static final String COLUMN_VALUE = "value";
  public static final String COLUMN_VERSION = "        version";
  public static final String COLUMN_TIMESERIES = "timeseries";
  public static final String COLUMN_TIMESERIES_ALIAS = "alias";
  public static final String COLUMN_TIMESERIES_DATATYPE = "dataType";
  public static final String COLUMN_TIMESERIES_ENCODING = "encoding";
  public static final String COLUMN_TIMESERIES_COMPRESSION = "compression";
  public static final String COLUMN_CHILD_PATHS = "child paths";
  public static final String COLUMN_DEVICES = "devices";
  public static final String COLUMN_COLUMN = "column";
  public static final String COLUMN_COUNT = "count";
  public static final String COLUMN_TAGS = "tags";
  public static final String COLUMN_ATTRIBUTES = "attributes";

  public static final String COLUMN_ROLE = "role";
  public static final String COLUMN_USER = "user";
  public static final String COLUMN_PRIVILEGE = "privilege";

  public static final String COLUMN_STORAGE_GROUP = "storage group";
  public static final String COLUMN_TTL = "ttl";

  public static final String COLUMN_TASK_NAME = "task name";
  public static final String COLUMN_CREATED_TIME = "created time";
  public static final String COLUMN_PROGRESS = "progress";
  public static final String COLUMN_CANCELLED = "cancelled";
  public static final String COLUMN_DONE = "done";

  public static final String COLUMN_FUNCTION_NAME = "UDF name";
  public static final String COLUMN_FUNCTION_CLASS = "class name";

  public static final String PATH_WILDCARD = "*";
  public static final String TIME = "time";

  // data folder name
  public static final String SEQUENCE_FLODER_NAME = "sequence";
  public static final String UNSEQUENCE_FLODER_NAME = "unsequence";
  public static final String FILE_NAME_SEPARATOR = "-";
  public static final String UPGRADE_FOLDER_NAME = "upgrade";

  // system folder name
  public static final String SYSTEM_FOLDER_NAME = "system";
  public static final String SCHEMA_FOLDER_NAME = "schema";
  public static final String SYNC_FOLDER_NAME = "sync";
  public static final String QUERY_FOLDER_NAME = "query";
  public static final String TRACING_FOLDER_NAME = "tracing";
  public static final String TRACING_LOG = "tracing.txt";

  // mqtt  
  public static final String ENABLE_MQTT = "enable_mqtt_service";
  public static final String MQTT_HOST_NAME = "mqtt_host";
  public static final String MQTT_PORT_NAME = "mqtt_port";
  public static final String MQTT_HANDLER_POOL_SIZE_NAME = "mqtt_handler_pool_size";
  public static final String MQTT_PAYLOAD_FORMATTER_NAME = "mqtt_payload_formatter";
  public static final String MQTT_MAX_MESSAGE_SIZE = "mqtt_max_message_size";

  // thrift
  public static final int LEFT_SIZE_IN_REQUEST = 4 * 1024 * 1024;
}
