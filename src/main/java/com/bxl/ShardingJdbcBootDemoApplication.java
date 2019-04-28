package com.bxl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.bxl.demo.dao")
public class ShardingJdbcBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcBootDemoApplication.class, args);
	}

}
