## Client02
客户端02
## yml配置
```yaml
spring:
  application:
    name: client02

server:
  port: 7002

eureka:
  instance:
    # eureka 客户端需要多长时间发送心跳给 eureka 服务端，默认 30s
    lease-renewal-interval-in-seconds: 2
    # eureka 服务端在接收到实例最后一次发送心跳后，需要等待多久才可以将实例移除 默认90s
    lease-expiration-duration-in-seconds: 10

  client:
    # 标识 eureka client 间隔多久去拉去服务器注册信息，默认 30s
    registry-fetch-interval-seconds: 30
    service-url:
      defaultZone: http://localhost:6001/eureka/

```

## xml 配置
```yaml
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

    <artifactId>spring-cloud-client02</artifactId>


    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
            <version>2.2.1.RELEASE</version>
        </dependency>
    </dependencies>

</project>
```