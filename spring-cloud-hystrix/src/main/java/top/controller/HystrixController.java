package top.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.service.HystrixService;

/**
 * @author bz
 * @date 2021/1/20
 */
@RestController
@AllArgsConstructor
public class HystrixController {

    private final HystrixService hystrixService;

    @GetMapping("/say")
    public String say(){
        return hystrixService.say();
    }

    @GetMapping("/eat")
    public String eat(){
        return hystrixService.eat();
    }
}
