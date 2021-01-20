package top.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.service.TestService;

/**
 * @author bz
 * @date 2021/1/20
 */
@RestController
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/say")
    public String getPort(){
        return testService.say();
    }
}
