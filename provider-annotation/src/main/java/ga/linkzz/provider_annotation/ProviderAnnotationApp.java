package ga.linkzz.provider_annotation;

import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * Created by Link.Zhang on 5/12/2021 8:49 PM
 **/
public class ProviderAnnotationApp {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.in.read();
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "ga.linkzz.provider_annotation")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static class ProviderConfiguration {

        @Bean
        public RegistryConfig registryConfig() {
            RegistryConfig config = new RegistryConfig();
            config.setProtocol("redis");
            config.setAddress("192.168.1.119:6379");
            config.setUsername("root");
            config.setPassword("123456");
            return config;
        }
    }
}
