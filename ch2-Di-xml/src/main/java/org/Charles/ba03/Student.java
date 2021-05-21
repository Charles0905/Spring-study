package org.Charles.ba03;


/**
 * @author Charles
 * @date 2021-05-11 18:25
 */
public class Student {
    private String name;
    private int age;
    //声明一个引用类型
    private School school;

    public Student() {
        System.out.println("no pram");
    }

    /**
     * 创建有参数构造函数
     * @param myName
     * @param myAge
     * @param mySchool
     */
    public Student(String myName, int myAge, School mySchool) {
        System.out.println("has pram");
        this.name = myName;
        this.age = myAge;
        this.school = mySchool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
