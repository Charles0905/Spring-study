package org.Charles;

import org.Charles.dao.StudentDao;
import org.Charles.domain.Student;
import org.Charles.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Charles
 * @date 2021-05-16 23:18
 */
public class MyTest {
    @Test
    public void testDaoInsert() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中dao
        StudentDao dao = (StudentDao) ctx.getBean("studentDao");
        Student student = new Student(1002, "Nancy", "Nancy2@gmail.com", 19);
        int nums = dao.insertStudent(student);
        System.out.println("nums = " + nums);
    }

    @Test
    public void testServiceInsert() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中StudentService
        StudentService service = (StudentService) ctx.getBean("studentService");

        Student student = new Student(1003, "Alan", "Alan46@gmail.com", 21);
        int nums = service.addStudent(student);
        System.out.println("nums = " + nums);
    }

    @Test
    public void testServiceSelect() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中StudentService
        StudentService service = (StudentService) ctx.getBean("studentService");

        List<Student> students = service.queryStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
