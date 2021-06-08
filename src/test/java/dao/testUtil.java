package dao;

import com.banyuan.study.dao.UserDao;
import com.banyuan.study.util.MybatisUtil;
import org.junit.Test;

/**
 * @author poi 2021/5/27 23:05
 * @version 1.0
 * 2021/5/27 23:05
 */
public class testUtil {
    @Test
    public void testUtils() {
        try {
            UserDao userDao = MybatisUtil.getMapper(UserDao.class);
            userDao.deleteUser(2);
            MybatisUtil.commit();
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }
}
