package com.youran.generate;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Title:
 * Description:
 * Author: cbb
 * Create Time:2017/9/19 14:16
 */
@Configuration
public class TestConfiguration {

    @Bean
    @ConditionalOnProperty(name="spring.datasource.url",havingValue="jdbc:h2:mem:testdb;MODE=MYSQL;DB_CLOSE_DELAY=-1")
    public H2Flusher h2Flusher(JdbcTemplate jdbcTemplate){
        return new H2Flusher(jdbcTemplate,"DB/generate.sql");
    }

}