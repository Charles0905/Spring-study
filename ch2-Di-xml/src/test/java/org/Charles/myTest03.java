package org.Charles;

import org.Charles.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author Charles
 * @date 2021-05-12 17:24
 */
public class myTest03 {
    @Test
    public void test1() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent2");
        System.out.println("student is " + myStudent);

        File myFile = (File) ac.getBean("myfile");
        System.out.println("myFile is " + myFile);
    }

}
