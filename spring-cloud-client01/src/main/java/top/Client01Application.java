package top;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bz
 * @date 2020/12/30
 */
@EnableEurekaClient
@RestController
@SpringBootApplication
public class Client01Application {
    public static void main(String[] args) {
        SpringApplication.run(Client01Application.class,args);
    }

    @GetMapping("/say")
    public String say(){
        return "client 01 , 7001";
    }

}
