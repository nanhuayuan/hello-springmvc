package com.banyuan.study.service;

import com.banyuan.study.bean.Department;
import com.banyuan.study.bean.User;
import com.banyuan.study.dao.DepartmentDao;
import com.banyuan.study.dao.UserDao;
import com.banyuan.study.util.MybatisUtil;

import java.util.List;

/**
 * @author poi 2021/6/1 22:00
 * @version 1.0
 * 2021/6/1 22:00
 */
public class UserService {

    public User selectUserById(Integer id) {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);

            User user = dao.selectUserById(id);
            return user;
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }

        return null;
    }
}
