package cn.itcast.service.controller;


import cn.itcast.service.client.UserClient;
import cn.itcast.service.pojo.User;
//import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//@DefaultProperties(defaultFallback = "queryByIdFallBack")
@Controller
@RequestMapping("consumer")
public class UserController {
//    @Autowired
//    private RestTemplate restTemplate;

    // eureka客户端，可以获取到eureka中服务的信息
//    @Autowired
//    private DiscoveryClient discoveryClient;


//    @HystrixCommand(fallbackMethod = "queryByIdFallBack")
//    @HystrixCommand//开启服务降级
//    @ResponseBody
//    @GetMapping("{id}")
//    public String queryById(@PathVariable("id") long id){
////        User user = restTemplate.getForObject("http://localhost:8081/user/" + id,User.class);
////        return user;
//        // 根据服务名称，获取服务实例。有可能是集群，所以是service实例集合
////        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
//        // 因为只有一个Service-provider。所以获取第一个实例
////        ServiceInstance instance = instances.get(0);
//        // 获取ip和端口信息，拼接成服务地址
////        String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/" + id;
//        String baseUrl = "http://service-provider/user/" + id;
//        String user = this.restTemplate.getForObject(baseUrl, String.class);
//        return user;
//    }

    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id){
        User user = this.userClient.queryById(id);
        return user;
    }

//    public String queryByIdFallBack(@PathVariable("id") long id){
////        log.error("查询用户信息失败，id: {}",id);
//        return "服务暂停";
//    }
//
//    public String queryByIdFallBack(){
//        return "服务暂停";
//    }
}
