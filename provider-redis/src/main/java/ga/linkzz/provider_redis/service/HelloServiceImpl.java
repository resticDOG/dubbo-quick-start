package ga.linkzz.provider_redis.service;

import ga.linkzz.common.service.HelloService;

/**
 * Created by Link.Zhang on 5/12/2021 7:55 PM
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
