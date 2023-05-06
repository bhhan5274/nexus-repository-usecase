package io.github.bhhan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        Hello hello = new Hello();
        hello.multiply(10, 20);
        hello.sum(100, 10000);
        return hello.world();
    }
}
