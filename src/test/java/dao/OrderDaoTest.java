package dao;


import com.banyuan.study.bean.Order;
import com.banyuan.study.dao.OrderDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author poi 2021/5/25 22:48
 * @version 1.0
 * 2021/5/25 22:48
 */
public class OrderDaoTest {

    @Test
    public void test1() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        OrderDao orderDao = sqlSession.getMapper(OrderDao.class);

        Order order = new Order();
        order.setId("aaaa");
        order.setName("第一件商品");
        //5.调用接口中的方法
        System.out.println(orderDao.insertOrder(order));
    }


}