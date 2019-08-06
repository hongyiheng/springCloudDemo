package com.example.service;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class userService {
    @Autowired
    private UserMapper usermapper;

    public User selectById(long id){
        return usermapper.selectByPrimaryKey(id);
    }
    @Transactional
    public void insertUser(User user){
        usermapper.insert(user);
    }

}
