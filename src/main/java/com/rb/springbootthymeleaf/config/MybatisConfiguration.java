package com.rb.springbootthymeleaf.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.rb.springbootthymeleaf.mapper")
public class MybatisConfiguration {

	
}
