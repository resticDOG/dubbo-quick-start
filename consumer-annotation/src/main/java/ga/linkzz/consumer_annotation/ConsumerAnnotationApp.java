package ga.linkzz.consumer_annotation;

import ga.linkzz.common.service.HelloService;
import ga.linkzz.consumer_annotation.component.HelloServiceComponent;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.*;

/**
 * Created by Link.Zhang on 5/12/2021 8:58 PM
 **/
public class ConsumerAnnotationApp {

    public static final Logger log = Logger.getLogger(ConsumerAnnotationApp.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        HelloService helloService = context.getBean("helloServiceComponent", HelloServiceComponent.class);
        String hello = helloService.sayHello("Consumer");
        log.info("Consumer say:" + hello);
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "ga.linkzz.consumer_annotation")
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = "ga.linkzz.consumer_annotation.component")
    static class ConsumerConfiguration {

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
