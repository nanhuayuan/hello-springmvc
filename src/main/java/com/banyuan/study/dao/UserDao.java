package com.banyuan.study.dao;

import com.banyuan.study.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author poi 2021/5/25 22:44
 * @version 1.0
 * 2021/5/25 22:44
 */
public interface UserDao {
    public User selectUserById(Integer id);

    //使用原生参数绑定
    public User selectUserByIdAndPwd(Integer id , String pwd);

    public User selectUserByIdAndPwd3(@Param("id") Integer id , @Param("pwd") String pwd);

    //添加Map进行参数绑定
    public User selectUserByIdAndPwd4(Map values);

    //使用对象属性进行参数绑定
    public User selectUserByUserInfo(User user);

    public List<User> selectUsersByKeyword(@Param("keyword") String keyword);

    int deleteUser(int userId);

    int updateUser(User user);

    List<User> selectUserByCondition();

    List<User> selectUserByNameAndSex(User user);

    List<User> selectUserByNameAndSex2(User user);

    int updateUserById(User user);

    List<User> selectUserbySexAndName3(User user);

    int updateUserById2(User user);

    List<User> selectUserByIds(@Param("list") List<Integer> list);

}
