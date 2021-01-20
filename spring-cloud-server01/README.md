## Server01 
服务端集群 01号

## 参数
```yml
spring:
  application:
    name: server01

server:
  port: 6001
eureka:
  instance:
    hostname: localhost
  client:
    # 是否在 eureka 服务商注册自己的信息，以提供其他服务发现，默认 true
    register-with-eureka: true
    #此客户端获取 eureka 服务器上的注册信息，默认 true
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

    <artifactId>spring-cloud-server01</artifactId>


    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
            <version>2.2.1.RELEASE</version>
        </dependency>
    </dependencies>
</project>
```
## 使用配置中心后
```yaml
spring:
  application:
    name: server01
  cloud:
    config:
      uri: http://localhost:7003/
      profile: dev
      label: main
```
## 新增依赖
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
    <artifactId>spring-cloud-server01</artifactId>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-config-client</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
    </dependencies>
</project>
```
