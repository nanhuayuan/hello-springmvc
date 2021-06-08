package com.banyuan.study.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Date birthday;
    private Date registTime;
    private Date birth;
    private Boolean gender;

    //无参构造（必备构造二选一）
    public User() {}

    //全参构造（必备构造二选一）
    public User(Integer id, String name, String password, String sex, Date birthday, Date registTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.registTime = registTime;
    }

}