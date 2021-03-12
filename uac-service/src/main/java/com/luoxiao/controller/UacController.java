package com.luoxiao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/12
 */

@RestController
public class UacController {

    @GetMapping("/hello")
    public String helloNacos(){
        return "hello Nacos";
    }

}
