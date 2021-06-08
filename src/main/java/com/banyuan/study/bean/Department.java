package com.banyuan.study.bean;

import lombok.Data;

import java.util.List;

/**
 * @author poi 2021/5/28 11:43
 * @version 1.0
 * 2021/5/28 11:43
 */
@Data
public class Department {
    private Integer id;
    private String name;
    private String location;
    private List<Employee> emps;
}
