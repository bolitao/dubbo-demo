package xyz.bolitao.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import xyz.bolitao.api.api.DemoService;

/**
 * @author tblsy
 */
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Value("${dubbo.application.name}")
    private String serviceName;
//    @NacosValue(value = "test.config", autoRefreshed = true)
//    private String testConfigStr;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
//        return String.format("[%s] : Hello, %s\n%s", serviceName, name, testConfigStr);
    }
}
