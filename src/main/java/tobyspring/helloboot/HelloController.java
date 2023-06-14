package tobyspring.helloboot;


import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RequestMapping("/hello")
public class HelloController {

    //컨트롤러의 역할 : 유저의 요청사항을 검증하는 것

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    @ResponseBody
    public String hello(String name){
        return helloService.sayHello(Objects.requireNonNull(name));
    }

}
