package com.bxl.demo.config;

import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import io.shardingsphere.core.keygen.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * Created by root on 2019/4/28.
 */
@Configuration
public class GeneratorOnleKey implements KeyGenerator{

//    @Override
//    public Long generateKey() {
//        return new DefaultKeyGenerator().generateKey().longValue();
//    }

   @Override
    public Long generateKey() {
       Random random = new Random();
       long rom = random.nextInt(10000);
       return rom;
    }



//    @Bean
//    public KeyGenerator keyGenerator() {
//        return new DefaultKeyGenerator();
//    }


}
