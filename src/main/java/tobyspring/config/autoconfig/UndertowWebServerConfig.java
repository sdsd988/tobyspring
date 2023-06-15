package tobyspring.config.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.embedded.undertow.UndertowWebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import tobyspring.config.ConditionalMyOnClass;
import tobyspring.config.MyAutoConfiguration;

@MyAutoConfiguration
@ConditionalMyOnClass("org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory")
public class UndertowWebServerConfig {

    @Bean("undertowWebServerFactory")
    @ConditionalOnMissingBean
    public ServletWebServerFactory serverFactory(){

        return new UndertowServletWebServerFactory();

    }
}
