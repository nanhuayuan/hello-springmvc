package dao;

import com.banyuan.study.bean.Manager;
import com.banyuan.study.dao.ManagerDao;
import com.banyuan.study.util.MybatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author poi 2021/5/27 23:05
 * @version 1.0
 * 2021/5/27 23:05
 */
public class ManagerDaoUtil {
    @Test
    public void testUtils() {
        try {
            ManagerDao managerDao = MybatisUtil.getMapper(ManagerDao.class);
            Manager manager = new Manager();
            manager.setId("1001");
            manager.setPassword("123456");
            List<Manager> managers = managerDao.selectManagerByIdAndPwd(manager);
            for (Manager manager1 : managers) {
                System.out.println(manager1);
            }

        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Test
    public void selectAllManagers() {
        try {
            ManagerDao managerDao = MybatisUtil.getMapper(ManagerDao.class);

            List<Manager> managers = managerDao.selectAllManagers();
            for (Manager manager1 : managers) {
                System.out.println(manager1);
            }

        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }
}
