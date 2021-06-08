package dao;

import com.banyuan.study.bean.User;
import com.banyuan.study.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author poi 2021/5/28 22:31
 * @version 1.0
 * 2021/5/28 22:31
 */
public class CacheTest {

    @Test
    public void flushCache() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //5.调用接口中的方法
        //一级缓存生效
        /*System.out.println("======第一次查询开始========");
        System.out.println(userDao.selectUserById(1));
        System.out.println("======第二次查询开始========");
        System.out.println(userDao.selectUserById(1));*/


        //中间更新
        /*System.out.println("======中间更新========");
        System.out.println("======第一次查询开始========");
        System.out.println(userDao.selectUserById(1));
        System.out.println("======中间更新========");

        User update = new User(); //测试类创建Map
        update.setId(1);
        update.setPassword("1234567");
        System.out.println(userDao.updateUser(update));
        System.out.println("======第二次查询开始========");
        System.out.println(userDao.selectUserById(1))*/;

        //加上flushCache="true"
        System.out.println("======关闭一级缓存========");
        System.out.println("======第一次查询开始========");
        System.out.println(userDao.selectUserById(1));
        System.out.println("======第二次查询开始========");
        System.out.println(userDao.selectUserById(1));

    }

    @Test
    public void testMapperCache() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        System.out.println("======第一次查询开始========");

        SqlSession sqlSession = factory.openSession();
        UserDao userDao1 = sqlSession.getMapper(UserDao.class);
        System.out.println(userDao1.selectUserById(1));
        sqlSession.close(); //必须关闭SqlSession才可缓存数据

        //二级缓存失效
        System.out.println("======中间更新开始========");
        SqlSession sqlSession3 = factory.openSession();
        UserDao userDao3 = sqlSession3.getMapper(UserDao.class);
        User update = new User(); //测试类创建Map
        update.setId(1);
        update.setPassword("123456");
        System.out.println(userDao3.updateUser(update));
        sqlSession3.commit(); //DML成功，数据发生变化，缓存清空
        sqlSession.close(); //必须关闭SqlSession才可缓存数据


        System.out.println("======第二次查询开始========");
        SqlSession sqlSession2 = factory.openSession();
        UserDao userDao2 = sqlSession2.getMapper(UserDao.class);
        System.out.println(userDao2.selectUserById(1));








    }
}
