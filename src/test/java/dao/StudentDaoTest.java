package dao;

import com.banyuan.study.bean.Student;
import com.banyuan.study.dao.StudentDao;
import com.banyuan.study.util.MybatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @author poi 2021/5/27 23:05
 * @version 1.0
 * 2021/5/27 23:05
 */
public class StudentDaoTest {


    @Test
    public void selectAllStudents() {
        try {
            StudentDao dao = MybatisUtil.getMapper(StudentDao.class);

            List<Student> ls = dao.selectAllStudents();
            for (Student p : ls) {
                System.out.println(p);
            }
        } catch (Exception e) {
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }
}
