package ga.linkzz.provider_redis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Link.Zhang on 5/12/2021 8:01 PM
 **/
public class ProviderRedisApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/spring/provider.xml"});
        context.start();
        System.in.read();
    }
}
