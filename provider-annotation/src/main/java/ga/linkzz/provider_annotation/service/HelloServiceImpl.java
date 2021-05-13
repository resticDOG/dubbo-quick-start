package ga.linkzz.provider_annotation.service;

import ga.linkzz.common.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by Link.Zhang on 5/12/2021 8:43 PM
 **/
@Service
public class HelloServiceImpl implements HelloService {

    public static final Logger log = Logger.getLogger(HelloServiceImpl.class);

    @Override
    public String sayHello(String name) {
        log.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
