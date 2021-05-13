package ga.linkzz;

import ga.linkzz.common.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by Link.Zhang on 5/13/2021 3:49 PM
 **/
@EnableAutoConfiguration
public class ConsumerSpringBootRegistryApp {

    @DubboReference
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringBootRegistryApp.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            String hello = helloService.sayHello("redis-spring-boot-consumer");
            System.out.println(hello);
        };
    }
}
