package cht.dubbo.consumer.controller;

import cht.dubbo.provider.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by martea on 2018/10/22.
 */

@RestController
@RequestMapping("test")
public class TestController {


    @Reference(version = "1.0.0")
    TestService testService;

    @RequestMapping("t1")
    public String test1(){
        return testService.test("sout");
    }


    @RequestMapping("t2")
    public String test2(){
        return "sout";
    }
}
