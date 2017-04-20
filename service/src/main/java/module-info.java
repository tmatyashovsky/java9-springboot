module com.lohika.morning.java9modules.service {

    requires java.xml.ws.annotation;
    requires spring.beans;
    requires spring.context;
    requires spring.data.mongodb;
    requires spring.data.commons;
    requires spring.boot.autoconfigure;
    requires mongo.java.driver;

    exports com.lohika.morning.java9modules.service.service to com.lohika.morning.java9modules.api;
    exports com.lohika.morning.java9modules.service.domain to com.lohika.morning.java9modules.api;
    exports com.lohika.morning.java9modules.service.configuration to com.lohika.morning.java9modules.api;

    opens com.lohika.morning.java9modules.service.service;
    opens com.lohika.morning.java9modules.service.configuration;
}
