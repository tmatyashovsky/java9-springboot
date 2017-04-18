package com.lohika.morning.java9modules.api;

import com.lohika.morning.java9modules.service.configuration.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(value = "com.lohika.morning.java9modules.api.*")
@Import(ServiceConfiguration.class)
public class ApplicationConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

}
