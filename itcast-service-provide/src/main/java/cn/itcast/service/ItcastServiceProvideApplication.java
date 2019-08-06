package cn.itcast.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.itcast.service.mapper")
public class ItcastServiceProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItcastServiceProvideApplication.class, args);
    }

}
