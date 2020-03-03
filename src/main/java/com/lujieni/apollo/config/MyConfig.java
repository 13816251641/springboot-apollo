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

    private String name;

    private String age;

    private String salary;

    @Value("${name}")
    public void setName(String apolloValue){
        System.out.println(apolloValue);
        this.name = apolloValue;
    }

    @Value("${age}")
    public void setAge(String apolloValue){
        System.out.println(apolloValue);
        this.age = apolloValue;
    }

    @Value("${salary}")
    public void setSalary(String apolloValue){
        System.out.println(apolloValue);
        this.salary = apolloValue;
    }

    @Bean
    public String getString(){
      log.info(name);
      log.info(age);
      log.info(salary);
      return name;
    }
}
