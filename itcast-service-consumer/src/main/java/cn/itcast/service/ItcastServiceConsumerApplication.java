package cn.itcast.service;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


//@EnableCircuitBreaker
//@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients // 开启feign客户端
@SpringCloudApplication
public class ItcastServiceConsumerApplication {

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ItcastServiceConsumerApplication.class, args);
    }

}
