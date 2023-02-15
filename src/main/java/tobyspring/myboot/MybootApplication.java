package tobyspring.myboot;

import org.apache.catalina.core.AprLifecycleListener;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import tobyspring.config.MySpringBootApplication;

@MySpringBootApplication
public class MybootApplication {


	public static void main(String[] args) {

		SpringApplication.run(MybootApplication.class, args);
	}

}
