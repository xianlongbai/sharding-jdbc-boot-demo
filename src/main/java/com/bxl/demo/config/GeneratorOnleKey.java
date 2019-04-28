package com.bxl.demo.config;

import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import io.shardingsphere.core.keygen.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by root on 2019/4/28.
 */
@Configuration
public class GeneratorOnleKey {

    @Bean
    public KeyGenerator keyGenerator() {

        //new SNOWFLAKE

        return new DefaultKeyGenerator();
    }
}
