package com.luoxiao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/12
 */

@FeignClient(name="uac-provider")
public interface OrderDetailService {

    @GetMapping(value = "/hello")
    public String helloNacos();

}
