package xyz.bolitao.consumer.web;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bolitao.api.api.DemoService;

/**
 * @author tblsy
 */
@RestController
public class ConsumerController {
    @DubboReference(version = "1.0.0", url = "127.0.0.1:20881")
    private DemoService demoService;

    @GetMapping(value = "/consumer")
    public String testConsumer() {
        return demoService.sayHello("consumer");
    }
}
