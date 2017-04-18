# java9-springboot
Demo application to evaluate Java 9 modules integration with Spring Boot.

There are 2 modules:
* api
* service

Where api is dependent on some packages from service.
The main idea was to create valid module-info.java classes to define valid exports, but, which is more important even, to open valid packages to Spring to be used via reflection.

The application cannot be started via Intellij IDEA.

In order to run:
* mvn clean install
* java -jar api/target/api-1.0-SNAPSHOT-exec.jar
