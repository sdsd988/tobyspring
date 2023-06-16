package tobyspring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import tobyspring.config.autoconfig.MyConfigurationProperties;

@MyConfigurationProperties(prefix = "server")
public class ServerProperties {

    String contextPath;

    int port;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
