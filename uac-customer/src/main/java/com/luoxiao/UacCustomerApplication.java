package com.luoxiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/11
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class UacCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UacCustomerApplication.class,args);
    }

}
