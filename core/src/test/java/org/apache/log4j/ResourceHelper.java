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
package org.apache.log4j;

import java.io.File;

/**
 * This class helps with looking up resources for test cases.
 *
 */
public class ResourceHelper {
    private static final String FILE_PREFIX = new File(ResourceHelper.class.getResource("/").getPath()).getAbsolutePath();
    private static final String INPUT_DIR = FILE_PREFIX + "/input";
    private static final String WITNESS_DIR = FILE_PREFIX + "/witness";
    private static final String OUTPUT_DIR = "/target/output";

    public static String inputFullpath(String filename) {
        return INPUT_DIR + filename;
    }

    public static String witnessFullpath(String filename) {
        return WITNESS_DIR + filename;
    }

    public static String outputFullpath(String filename) {
        return new File(".").getAbsolutePath() + OUTPUT_DIR + filename;
    }

    public static String outputTemp() {
        return outputFullpath("/temp");
    }

    public static String outputFiltered() {
            return outputFullpath("/filtered");
    }
}