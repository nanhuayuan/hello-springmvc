package dao;

import com.banyuan.study.bean.User;
import com.banyuan.study.dao.UserDao;
import com.banyuan.study.util.MybatisUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import java.util.List;

/**
 * @author poi 2021/5/28 22:31
 * @version 1.0
 * 2021/5/28 22:31
 */
public class PageInterceptorTest {

    @Test
    public void testPagehelper() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            PageHelper.startPage(1,1);//使用PageHelper设置分页条件
            List<User> ls = dao.selectUserByCondition();
            System.out.println("==============");
            for (User p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void testPageInfo() {
        try {
            UserDao dao = MybatisUtil.getMapper(UserDao.class);
            PageHelper.startPage(-1,1);//使用PageHelper设置分页条件
            List<User> ls = dao.selectUserByCondition();
            PageInfo<User> pageInfo = new PageInfo<User>(ls);//将分页查询的结果集保存在PageInfo对象中
            System.out.println("==============");
            System.out.println(pageInfo);
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }



}
