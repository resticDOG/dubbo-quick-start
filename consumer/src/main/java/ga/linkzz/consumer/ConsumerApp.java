package ga.linkzz.consumer;

import ga.linkzz.common.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Link.Zhang on 5/12/2021 5:59 PM
 **/
public class ConsumerApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/spring/consumer.xml"});
        HelloService helloService = context.getBean(HelloService.class);
        String hello = helloService.sayHello("World");
        System.out.println(hello);
    }
}
