package tobyspring.myboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;


    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(String name){
        //컨트롤러의 역할 중 하나는 클라이언트의 요청 사항을 검증하는 것이다.
        if(name==null|| name.trim().length() == 0) throw new IllegalArgumentException();
        return helloService.sayHello(name);
    }
}
