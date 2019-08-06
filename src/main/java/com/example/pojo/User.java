package com.example.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name="tb_user")
public class User {
    @KeySql(useGeneratedKeys = true)//字段自增
    @Id
    private Integer id;
    //名字
    private String username;
    private String password;
    private String phone;
    private String email;

    @Transient//不需要持久化到数据库
    private String other;
}
