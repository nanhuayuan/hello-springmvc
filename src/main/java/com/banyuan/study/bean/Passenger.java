package com.banyuan.study.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author poi 2021/5/28 10:18
 * @version 1.0
 * 2021/5/28 10:18
 */
@Data
public class Passenger {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private Passport passport;
}
