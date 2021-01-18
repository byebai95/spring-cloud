## Server02
服务端集群 02号
## 配置
```yml
spring:
  application:
    name: server02

server:
  port: 6002
eureka:
  instance:
    hostname: localhost
  client:
    register-with-eureka: true
    fetch-registry: false
    service-url:
      defaultZone: http://server01:6001/eureka/,http://server02:6002/eureka/,http://server03:6003/eureka/
  server:
    #开启自我保护模式（开启状态下服务停掉eureka不会立刻清除宕机服务）
    enable-self-preservation: false
    #清理掉无效的节点，默认 60*1000 ,即 60s
    eviction-interval-timer-in-ms: 5000
```
## xml配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>spring-cloud</artifactId>
        <groupId>top.supoman</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>spring-cloud-server02</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
            <version>2.2.1.RELEASE</version>
        </dependency>
    </dependencies>

</project>
```
