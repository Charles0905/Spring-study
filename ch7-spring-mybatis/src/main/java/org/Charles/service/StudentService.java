package org.Charles.service;


import org.Charles.domain.Student;

import java.util.List;

/**
 * @author Charles
 * @date 2021-05-16 22:39
 */
public interface StudentService {

    int addStudent(Student student);
    List<Student> queryStudents();
}
