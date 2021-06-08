package com.banyuan.study.dao;

import com.banyuan.study.bean.Manager;

import java.util.List;

/**
 * @author poi 2021/5/27 21:46
 * @version 1.0
 * 2021/5/27 21:46
 */
public interface ManagerDao {

    List<Manager> selectManagerByIdAndPwd(Manager manager);

    List<Manager> selectAllManagers();
}
