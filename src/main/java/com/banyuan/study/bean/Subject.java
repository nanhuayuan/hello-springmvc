package com.banyuan.study.bean;

import lombok.Data;

import java.util.List;

/**
 * @author poi 2021/5/28 15:10
 * @version 1.0
 * 2021/5/28 15:10
 */
@Data
public class Subject {
    private Integer id;
    private String name;
    private Integer grade;
    private List<Student> students;
}
