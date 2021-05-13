package ga.linkzz.provider.service;

import ga.linkzz.common.service.HelloService;

/**
 * Created by Link.Zhang on 5/12/2021 5:35 PM
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
