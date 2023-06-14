package tobyspring.helloboot;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class HelloController  {

    //컨트롤러의 역할 : 유저의 요청사항을 검증하는 것

    private final HelloService helloService;
    private  ApplicationContext applicationContext;


    public HelloController(HelloService helloService, ApplicationContext applicationContext) {
        this.helloService = helloService;
        this.applicationContext = applicationContext;
    }

    @GetMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(Objects.requireNonNull(name));
    }


}
