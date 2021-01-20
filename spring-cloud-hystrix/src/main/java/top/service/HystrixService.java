package top.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author bz
 * @date 2021/1/20
 */
@Service
@AllArgsConstructor
public class HystrixService {

    @HystrixCommand(fallbackMethod = "error")
    public String say(){
        int i = 1/0;
        return "say() request success";
    }


    @HystrixCommand(fallbackMethod = "error")
    public String eat(){
        return "eat() request success";
    }

    public String error(){
        return "Hystrix:系统异常";
    }
}
