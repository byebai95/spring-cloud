package top;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bz
 * @date 2020/12/31
 */
@RestController
@SpringBootApplication
@EnableEurekaClient
public class Client02Application {

    public static void main(String[] args) {
        SpringApplication.run(Client02Application.class,args);
    }


    @GetMapping("/getPort")
    public String getPort(){
        return "server02 , port : 7002";
    }

}
