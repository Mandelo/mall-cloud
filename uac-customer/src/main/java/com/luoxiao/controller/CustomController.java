package com.luoxiao.controller;

import com.luoxiao.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/12
 */

@RestController
public class CustomController {

    @Autowired
    OrderDetailService orderDetailService;

    @GetMapping("/api/helloNacos")
    public String helloNacos(){
        return orderDetailService.helloNacos();
    }

}
