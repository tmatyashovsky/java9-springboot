package com.lohika.morning.java9modules.service.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lohika.morning.java9modules.service.*")
//@EnableMongoRepositories("com.lohika.morning.java9modules.service.repository")
public class ServiceConfiguration {
}
