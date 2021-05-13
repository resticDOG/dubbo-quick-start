package ga.linkzz.consumer_annotation.component;

import ga.linkzz.common.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by Link.Zhang on 5/12/2021 9:06 PM
 **/
@Component("helloServiceComponent")
public class HelloServiceComponent implements HelloService {

    @Reference
    private HelloService helloService;

    @Override
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
