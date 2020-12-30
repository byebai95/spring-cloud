package top;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author bz
 * @date 2020/12/30
 */
@SpringBootApplication
@EnableEurekaServer
public class Server03Application {
    public static void main(String[] args) {
        SpringApplication.run(Server03Application.class,args);
    }
}
