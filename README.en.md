# evaluation

#### Description
学生课程评价系统

#### Software Architecture
Software architecture description

#### Installation

1. xxxx
2. xxxx
3. xxxx

#### Instructions

1. xxxx
2. xxxx
3. xxxx

#### 项目依赖树
```properties

[INFO] com.evaluation:evaluation:jar:0.0.1-SNAPSHOT
[INFO] +- org.springframework.boot:spring-boot-starter-jdbc:jar:2.0.6.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter:jar:2.0.6.RELEASE:compile
[INFO] |  |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.0.6.RELEASE:compile
[INFO] |  |  |  +- ch.qos.logback:logback-classic:jar:1.2.3:compile
[INFO] |  |  |  |  \- ch.qos.logback:logback-core:jar:1.2.3:compile
[INFO] |  |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.10.0:compile
[INFO] |  |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.10.0:compile
[INFO] |  |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.25:compile
[INFO] |  |  \- org.yaml:snakeyaml:jar:1.19:runtime
[INFO] |  +- com.zaxxer:HikariCP:jar:2.7.9:compile
[INFO] |  |  \- org.slf4j:slf4j-api:jar:1.7.25:compile
[INFO] |  \- org.springframework:spring-jdbc:jar:5.0.10.RELEASE:compile
[INFO] |     +- org.springframework:spring-beans:jar:5.0.10.RELEASE:compile
[INFO] |     \- org.springframework:spring-tx:jar:5.0.10.RELEASE:compile
[INFO] +- org.springframework.boot:spring-boot-starter-web:jar:2.0.6.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-json:jar:2.0.6.RELEASE:compile
[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.9.7:compile
[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.9.7:compile
[INFO] |  |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.9.7:compile
[INFO] |  +- org.hibernate.validator:hibernate-validator:jar:6.0.13.Final:compile
[INFO] |  |  +- javax.validation:validation-api:jar:2.0.1.Final:compile
[INFO] |  |  +- org.jboss.logging:jboss-logging:jar:3.3.2.Final:compile
[INFO] |  |  \- com.fasterxml:classmate:jar:1.3.4:compile
[INFO] |  +- org.springframework:spring-web:jar:5.0.10.RELEASE:compile
[INFO] |  \- org.springframework:spring-webmvc:jar:5.0.10.RELEASE:compile
[INFO] |     +- org.springframework:spring-aop:jar:5.0.10.RELEASE:compile
[INFO] |     +- org.springframework:spring-context:jar:5.0.10.RELEASE:compile
[INFO] |     \- org.springframework:spring-expression:jar:5.0.10.RELEASE:compile
[INFO] +- com.fasterxml.jackson.core:jackson-databind:jar:2.9.2:compile
[INFO] |  \- com.fasterxml.jackson.core:jackson-annotations:jar:2.9.0:compile
[INFO] +- com.fasterxml.jackson.core:jackson-core:jar:2.9.2:compile
[INFO] +- mysql:mysql-connector-java:jar:5.1.47:runtime
[INFO] +- org.projectlombok:lombok:jar:1.16.22:compile (optional) 
[INFO] +- org.springframework.boot:spring-boot-starter-tomcat:jar:2.0.6.RELEASE:provided
[INFO] |  +- javax.annotation:javax.annotation-api:jar:1.3.2:compile
[INFO] |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:8.5.34:provided
[INFO] |  +- org.apache.tomcat.embed:tomcat-embed-el:jar:8.5.34:provided
[INFO] |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:8.5.34:provided
[INFO] +- org.springframework.boot:spring-boot-starter-test:jar:2.0.6.RELEASE:test
[INFO] |  +- org.springframework.boot:spring-boot-test:jar:2.0.6.RELEASE:test
[INFO] |  +- org.springframework.boot:spring-boot-test-autoconfigure:jar:2.0.6.RELEASE:test
[INFO] |  +- com.jayway.jsonpath:json-path:jar:2.4.0:test
[INFO] |  |  \- net.minidev:json-smart:jar:2.3:test
[INFO] |  |     \- net.minidev:accessors-smart:jar:1.2:test
[INFO] |  |        \- org.ow2.asm:asm:jar:5.0.4:test
[INFO] |  +- junit:junit:jar:4.12:test
[INFO] |  +- org.assertj:assertj-core:jar:3.9.1:test
[INFO] |  +- org.mockito:mockito-core:jar:2.15.0:test
[INFO] |  |  +- net.bytebuddy:byte-buddy:jar:1.7.11:test
[INFO] |  |  +- net.bytebuddy:byte-buddy-agent:jar:1.7.11:test
[INFO] |  |  \- org.objenesis:objenesis:jar:2.6:test
[INFO] |  +- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] |  +- org.hamcrest:hamcrest-library:jar:1.3:test
[INFO] |  +- org.skyscreamer:jsonassert:jar:1.5.0:test
[INFO] |  |  \- com.vaadin.external.google:android-json:jar:0.0.20131108.vaadin1:test
[INFO] |  +- org.springframework:spring-core:jar:5.0.10.RELEASE:compile
[INFO] |  |  \- org.springframework:spring-jcl:jar:5.0.10.RELEASE:compile
[INFO] |  +- org.springframework:spring-test:jar:5.0.10.RELEASE:test
[INFO] |  \- org.xmlunit:xmlunit-core:jar:2.5.1:test
[INFO] +- org.mybatis.spring.boot:mybatis-spring-boot-starter:jar:1.3.2:compile
[INFO] |  +- org.mybatis.spring.boot:mybatis-spring-boot-autoconfigure:jar:1.3.2:compile
[INFO] |  +- org.mybatis:mybatis:jar:3.4.6:compile
[INFO] |  \- org.mybatis:mybatis-spring:jar:1.3.2:compile
[INFO] +- com.alibaba:fastjson:jar:1.2.51:compile
[INFO] +- org.springframework.boot:spring-boot-starter-freemarker:jar:2.0.6.RELEASE:compile
[INFO] |  +- org.freemarker:freemarker:jar:2.3.28:compile
[INFO] |  \- org.springframework:spring-context-support:jar:5.0.10.RELEASE:compile
[INFO] +- javax.servlet:javax.servlet-api:jar:4.0.1:compile
[INFO] \- org.springframework.boot:spring-boot-devtools:jar:2.0.6.RELEASE:compile (optional) 
[INFO]    +- org.springframework.boot:spring-boot:jar:2.0.6.RELEASE:compile
[INFO]    \- org.springframework.boot:spring-boot-autoconfigure:jar:2.0.6.RELEASE:compile

```



#### Gitee Feature

1. You can use Readme\_XXX.md to support different languages, such as Readme\_en.md, Readme\_zh.md
2. Gitee blog [blog.gitee.com](https://blog.gitee.com)
3. Explore open source project [https://gitee.com/explore](https://gitee.com/explore)
4. The most valuable open source project [GVP](https://gitee.com/gvp)
5. The manual of Gitee [https://gitee.com/help](https://gitee.com/help)
6. The most popular members  [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)