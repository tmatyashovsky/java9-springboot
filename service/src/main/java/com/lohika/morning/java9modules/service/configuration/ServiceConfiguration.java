package com.lohika.morning.java9modules.service.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan("com.lohika.morning.java9modules.service.*")
@EnableMongoRepositories(basePackages = "com.lohika.morning.java9modules.service.repository")
@PropertySource("service.properties")
public class ServiceConfiguration {
}
