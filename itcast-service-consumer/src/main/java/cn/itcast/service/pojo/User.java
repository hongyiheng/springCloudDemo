package cn.itcast.service.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionID = 1L;

    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
}