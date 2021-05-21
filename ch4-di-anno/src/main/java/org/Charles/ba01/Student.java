package org.Charles.ba01;


import org.springframework.stereotype.Component;

/**
 * @author Charles
 * @date 2021-05-12 21:09
 */

@Component
public class Student {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
