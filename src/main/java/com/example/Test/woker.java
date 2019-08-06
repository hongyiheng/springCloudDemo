package com.example.Test;

import lombok.Data;

@Data
public class woker {
    private String name;
    private String age;
    private String wages;

    public woker(String name, String age, String wages) {
        this.name = name;
        this.age = age;
        this.wages = wages;
    }
}
