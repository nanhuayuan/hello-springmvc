package com.banyuan.study.dao;

import com.banyuan.study.bean.Manager;
import com.banyuan.study.bean.Passenger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author poi 2021/5/27 21:46
 * @version 1.0
 * 2021/5/27 21:46
 */
public interface PassengerDao {

    List<Passenger> selectPassengerById(@Param("id") Integer id);

}
