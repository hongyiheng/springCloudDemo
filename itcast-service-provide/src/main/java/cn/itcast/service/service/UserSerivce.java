package cn.itcast.service.service;

import cn.itcast.service.mapper.UserMapper;
import cn.itcast.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivce {
    @Autowired
    private UserMapper userMapper;

    public User queryById(long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
