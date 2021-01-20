package top.controller;

import lombok.AllArgsConstructor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.service.RibbonService;

/**
 * @author bz
 * @date 2021/1/20
 */
@RestController
@AllArgsConstructor
public class RibbonController {

    @LoadBalanced
    private final RibbonService ribbonService;

    @GetMapping("/say")
    public String say(){
        return ribbonService.say();
    }
}
