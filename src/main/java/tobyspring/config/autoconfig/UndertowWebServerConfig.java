package tobyspring.config.autoconfig;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.embedded.undertow.UndertowWebServer;
import org.springframework.context.annotation.Bean;
import tobyspring.config.ConditionalMyOnClass;
import tobyspring.config.MyAutoConfiguration;

@MyAutoConfiguration
@ConditionalMyOnClass("org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory")
public class UndertowWebServerConfig {

    @Bean("undertowWebServerFactory")
    public UndertowServletWebServerFactory serverFactory(){

        return new UndertowServletWebServerFactory();

    }
}
