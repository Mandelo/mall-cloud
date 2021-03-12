package com.luoxiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/11
 */
@EnableDiscoveryClient
@SpringBootApplication
class UacProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UacProviderApplication.class,args);
    }

}

