package com.example.cousulconsumer.controller;

import com.example.cousulconsumer.service.client.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    /** 调用 hello 服务*/
    @Autowired
    private HelloService helloService;

    //默认健康检查接口
    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }

    /** 接收前端传来的参数，调用远程接口，并返回调用结果 */
    @GetMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(name);
    }

    /**
     * 这里我们不使用默认的健康检测, 而是使用自己定义的接口
     * @return SUCCESS
     */
    @GetMapping("/healthCustomer")
    public String healthCustomer(){
        return "SUCCESS";
    }


}
