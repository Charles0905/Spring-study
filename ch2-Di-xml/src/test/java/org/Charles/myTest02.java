package org.Charles;

import org.Charles.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Charles
 * @date 2021-05-12 17:24
 */
public class myTest02 {
    @Test
    public void test1() {
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student is " + myStudent);
    }

}
