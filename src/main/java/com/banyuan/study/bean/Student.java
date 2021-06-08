package com.banyuan.study.bean;

import lombok.Data;

import java.util.List;

/**
 * @author poi 2021/5/28 15:08
 * @version 1.0
 * 2021/5/28 15:08
 */
@Data
public class Student {
  private Integer id;
  private String name;
  private String sex;
  private List<Subject> subjects;
}
