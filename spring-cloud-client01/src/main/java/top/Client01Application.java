package top;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author bz
 * @date 2020/12/30
 */
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
public class Client01Application {
    public static void main(String[] args) {
        SpringApplication.run(Client01Application.class,args);
    }

     @Bean
     public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
