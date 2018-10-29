package cht.dubbo.provider.service.impl;

import cht.dubbo.provider.service.TestService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by martea on 2018/10/22.
 */

@Service(version = "1.0.0")
@Component
public class TestServiceImpl implements TestService{

    @Override
    public String test(String arg1) {
        return arg1;
    }
}
