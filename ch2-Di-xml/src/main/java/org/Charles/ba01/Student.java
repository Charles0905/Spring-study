package org.Charles.ba01;

/**
 * @author Charles
 * @date 2021-05-11 18:25
 */
public class Student {
    private String name;
    private int age;

    /**
     * 需要有set方法，没有set方法是错误的；
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
