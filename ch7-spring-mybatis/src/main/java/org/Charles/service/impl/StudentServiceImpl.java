package org.Charles.service.impl;

import org.Charles.dao.StudentDao;
import org.Charles.domain.Student;
import org.Charles.service.StudentService;

import java.util.List;

/**
 * @author Charles
 * @date 2021-05-16 22:41
 */
public class StudentServiceImpl implements StudentService {
    //引用类型
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.selectStudent();
        return students;
    }
}
