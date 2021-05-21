package org.Charles;

import org.Charles.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Charles
 * @date 2021-05-12 17:24
 */
public class myTest04 {
    @Test
    public void test1() {
        String config = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent2");
        System.out.println("student is " + myStudent);

    }

}
