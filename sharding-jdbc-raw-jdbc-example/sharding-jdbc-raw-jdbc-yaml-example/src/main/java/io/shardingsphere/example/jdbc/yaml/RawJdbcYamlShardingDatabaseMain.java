/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.example.jdbc.yaml;

import io.shardingsphere.example.jdbc.yaml.repository.RawJdbcYamlRepository;
import io.shardingsphere.core.api.ShardingDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;

public class RawJdbcYamlShardingDatabaseMain {
    
    public static void main(final String[] args) throws Exception {
        DataSource dataSource = ShardingDataSourceFactory.createDataSource(new File(RawJdbcYamlShardingDatabaseMain.class.getResource("/META-INF/sharding-databases.yaml").getFile()));
        new RawJdbcYamlRepository(dataSource).demo();
    }
}
