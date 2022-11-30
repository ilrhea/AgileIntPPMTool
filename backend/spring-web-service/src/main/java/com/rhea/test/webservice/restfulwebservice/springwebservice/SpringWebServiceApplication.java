package com.rhea.test.webservice.restfulwebservice.springwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebServiceApplication.class, args);
    }

}
