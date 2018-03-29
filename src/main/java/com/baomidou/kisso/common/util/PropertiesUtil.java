/*
 * Copyright (c) 2017-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.kisso.common.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>
 * Properties 工具类
 * </p>
 *
 * @author hubin
 * @since 2018-03-28
 */
public class PropertiesUtil {

    public static Properties loadProperties(String propertiesFile) throws IOException {
        InputStream input = null;
        try {
            input = new FileInputStream(propertiesFile);
            Properties properties = new OrderedProperties();
            properties.load(input);
            return properties;
        } finally {
            IoUtil.close(input);
        }
    }

}