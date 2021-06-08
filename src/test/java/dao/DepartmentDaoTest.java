package dao;

import com.banyuan.study.bean.Department;
import com.banyuan.study.dao.DepartmentDao;
import com.banyuan.study.util.MybatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author poi 2021/5/27 23:05
 * @version 1.0
 * 2021/5/27 23:05
 */
public class DepartmentDaoTest {


    @Test
    public void selectAllManagers() {
        try {
            DepartmentDao dao = MybatisUtil.getMapper(DepartmentDao.class);

            List<Department> ls = dao.selectDepartmentById(1);
            for (Department p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }
}
