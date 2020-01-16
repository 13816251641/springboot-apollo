package com.lujieni.apollo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther ljn
 * @Date 2019/11/14
 */
@Configuration
@Slf4j
public class MyConfig {
    @Value("${name}")
    public void setName(String name){
        System.out.println(name);
    }


/*    @Bean
    public String getString(){
      log.info(name);
      return name;
    }*/



}
