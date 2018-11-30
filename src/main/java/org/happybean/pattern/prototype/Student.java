package org.happybean.pattern.prototype;

/**
 * @author wgt
 * @date 2018-11-30
 * @description
 **/
public class Student implements Cloneable{

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        return student;
    }
}
