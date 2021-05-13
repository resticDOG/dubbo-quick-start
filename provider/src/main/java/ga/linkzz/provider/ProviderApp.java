package ga.linkzz.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Link.Zhang on 5/12/2021 5:36 PM
 **/
public class ProviderApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/spring/provider.xml"});
        context.start();
        System.in.read();
    }
}
