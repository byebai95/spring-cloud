package top;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bz
 * @date 2020/12/30
 */
@RestController
@SpringBootApplication
@EnableEurekaClient
public class Client01Application {
    public static void main(String[] args) {
        SpringApplication.run(Client01Application.class,args);
    }


    @GetMapping("/getPort")
    public String getPort(){
        return "server01 , port : 7001";
    }
}
