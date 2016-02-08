/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gemstone.gemfire.internal.size;

/**
 * A Size of util class which does nothing. This is useful for running the test
 * with jprobe, because jprobe doesn't play nicely with the -javaagent flag. If
 * we implement a 1.4 SizeOfUtil class, then we probably don't need this one.
 * 
 * @author dsmith
 * 
 */
public class SizeOfUtil0 implements SingleObjectSizer {

  public long sizeof(Object object) {
    return 2;
  }

}
