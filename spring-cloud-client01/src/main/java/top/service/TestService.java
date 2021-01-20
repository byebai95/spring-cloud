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
public class TestService {

    private final RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String say(){
        int i = 1/0;
        return restTemplate.getForObject("http://localhost:7002/getPort",String.class);
    }

    public String error(){
        return "Hystrix:系统异常";
    }
}
