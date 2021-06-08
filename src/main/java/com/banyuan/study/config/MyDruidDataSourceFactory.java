package com.banyuan.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * @author poi 2021/5/29 16:00
 * @version 1.0
 * 2021/5/29 16:00
 */
public class MyDruidDataSourceFactory  extends PooledDataSourceFactory {

    public MyDruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();//替换数据源
    }

}
