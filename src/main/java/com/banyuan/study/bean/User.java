package com.banyuan.study.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author poi 2021/5/30 11:50
 * @version 1.0
 * 2021/5/30 11:50
 */
@Data
public class User {
    private Integer id;
    private String name;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;
    private Boolean gender;
}
