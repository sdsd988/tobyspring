package tobyspring.helloboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

public class HelloController {

    public String hello(String name){

        //컨트롤러의 역할 : 유저의 요청사항을 검증하는 것

        SimpleHelloService helloService = new SimpleHelloService();

        return helloService.sayHello(Objects.requireNonNull(name));
    }

}
