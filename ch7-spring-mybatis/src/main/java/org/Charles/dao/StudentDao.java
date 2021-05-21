package org.Charles.dao;

import org.Charles.domain.Student;

import java.util.List;

/**
 * @author Charles
 * @date 2021-05-16 20:23
 */
public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
