package top.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author bz
 * @date 2021/1/20
 */
@Service
@AllArgsConstructor
public class RibbonService {
    private final RestTemplate restTemplate;

    public String say(){
        return  restTemplate.getForObject("http://localhost/say",String.class);
    }
}
