package ga.linkzz.service;

import ga.linkzz.common.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Link.Zhang on 5/13/2021 3:39 PM
 **/
@DubboService
public class HelloServiceImpl implements HelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]: Hello, %s", serviceName, name);
    }
}
