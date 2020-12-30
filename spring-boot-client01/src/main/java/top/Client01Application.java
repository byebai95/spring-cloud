package top;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bz
 * @date 2020/12/30
 */
@SpringBootApplication
@EnableEurekaClient
public class Client01Application {
    public static void main(String[] args) {
        SpringApplication.run(Client01Application.class,args);
    }
}
