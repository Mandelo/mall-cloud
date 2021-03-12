package com.luoxiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacoServiceApplication.class,args);
    }

}
