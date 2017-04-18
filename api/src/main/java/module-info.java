module com.lohika.morning.java9modules.api {

    requires java.sql;
    requires java.xml.ws.annotation;

    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.expression;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires com.lohika.morning.java9modules.service;

    exports com.lohika.morning.java9modules.api;
    exports com.lohika.morning.java9modules.api.controller;

    opens com.lohika.morning.java9modules.api;
    opens com.lohika.morning.java9modules.api.controller;
}