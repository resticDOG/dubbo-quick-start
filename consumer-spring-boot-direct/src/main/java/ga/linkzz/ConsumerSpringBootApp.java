package ga.linkzz;

import ga.linkzz.common.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.log4j.Logger;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 启动类
 * <p>
 * Created by Link.Zhang on 5/13/2021 3:18 PM
 **/
@EnableAutoConfiguration
public class ConsumerSpringBootApp {

    private static final Logger log = Logger.getLogger(ConsumerSpringBootApp.class);

    @DubboReference(url = "dubbo://127.0.0.1:24355")
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringBootApp.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> log.info(helloService.sayHello("Spring Boot World!"));
    }
}
