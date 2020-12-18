package com.zh.api.controller;

import com.zh.api.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: CloudDemo
 * @description:
 * @author: zhaohe
 * @create: 2020-12-18 20:55
 **/
@RestController
public class ApiController {

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("hi")
    public String main(){
        return orderFeign.hi("1");
    }
}
