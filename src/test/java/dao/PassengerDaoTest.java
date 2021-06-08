package dao;

import com.banyuan.study.bean.Passenger;
import com.banyuan.study.dao.PassengerDao;
import com.banyuan.study.util.MybatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author poi 2021/5/27 23:05
 * @version 1.0
 * 2021/5/27 23:05
 */
public class PassengerDaoTest {


    @Test
    public void selectAllManagers() {
        try {
            PassengerDao managerDao = MybatisUtil.getMapper(PassengerDao.class);

            List<Passenger> ls = managerDao.selectPassengerById(1001);
            for (Passenger p : ls) {
                System.out.println(p);
            }

        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }
}
