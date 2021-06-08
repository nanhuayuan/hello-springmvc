package dao;


import com.banyuan.study.bean.User;
import com.banyuan.study.dao.UserDao;
import com.banyuan.study.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author poi 2021/5/25 22:48
 * @version 1.0
 * 2021/5/25 22:48
 */
public class UserDaoTest {

    @Test
    public void test1() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //5.调用接口中的方法
        System.out.println(userDao.selectUserById(1));
    }

    @Test
    public void test2() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象直接调用接口中的方法
        Object o = sqlSession.selectOne("com.banyuan.study.dao.UserDao.selectUserById", 1);

        System.out.println(o);
    }

    @Test
    public void selectUserByIdAndPwd() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //5.调用接口中的方法
        System.out.println(userDao.selectUserByIdAndPwd(1, "123456"));
    }

    @Test
    public void selectUserByIdAndPwd2() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //5.调用接口中的方法
        System.out.println(userDao.selectUserByIdAndPwd(1, "123456"));
    }

    @Test
    public void selectUserByIdAndPwd3() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //5.调用接口中的方法
        System.out.println(userDao.selectUserByIdAndPwd3(1, "123456"));
    }

    @Test
    public void selectUserByIdAndPwd4() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        Map query = new HashMap(); //测试类创建Map
        query.put("myId",1); //自定义key，绑定参数
        query.put("myPwd","123456");
        //5.调用接口中的方法
        System.out.println(userDao.selectUserByIdAndPwd4(query));
    }

    @Test
    public void selectUserByUserInfo() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User query = new User(); //测试类创建Map
        query.setId(1);
        query.setPassword("123456");
        //5.调用接口中的方法
        System.out.println(userDao.selectUserByUserInfo(query));
    }

    @Test
    public void selectUsersByKeyword() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //5.调用接口中的方法
        System.out.println(userDao.selectUsersByKeyword("min"));
    }

    @Test
    public void deleteUser() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //5.调用接口中的方法
        System.out.println(userDao.deleteUser(2));
    }

    @Test
    public void updateUser() throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        //4.通过连接对象获得接口实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User update = new User(); //测试类创建Map
        update.setId(1);
        update.setPassword("1234567");
        //5.调用接口中的方法
        System.out.println(userDao.updateUser(update));
    }

    @Test
    public void selectAllManagers() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);

            List<User> ls = dao.selectUserByCondition();
            for (User p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void selectUserByNameAndSex() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            User user = new User();
            user.setSex("1");
            user.setName("root");
            List<User> ls = dao.selectUserByNameAndSex(user);
            for (User p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void selectUserByNameAndSex2() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            User user = new User();
            /*user.setSex("1");
            user.setName("root");*/
            List<User> ls = dao.selectUserByNameAndSex2(user);
            for (User p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void updateUserById() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            User user = new User();
            user.setId(1);
            user.setSex("2");
            user.setName("root2");

            System.out.println(dao.updateUserById(user));

        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void selectUserByNameAndSex3() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            User user = new User();
            /*user.setSex("1");
            user.setName("root");*/
            List<User> ls = dao.selectUserbySexAndName3(user);
            for (User p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void updateUserById2() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            User user = new User();
            user.setId(1);
            user.setSex("2");
            /*user.setName("root2");*/

            System.out.println(dao.updateUserById2(user));

        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void selectUserByIds() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            ArrayList<Integer> ids = new ArrayList<>();
            ids.add(1);
            List<User> ls = dao.selectUserByIds(ids);
            for (User p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void selectUserByIds2() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            ArrayList<Integer> ids = new ArrayList<>();
            ids.add(1);
            List<User> ls = dao.selectUserByIds(ids);
            System.out.println("==============");
            ls = dao.selectUserByIds(ids);
            for (User p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }


}