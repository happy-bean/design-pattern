package org.happybean.pattern.prototype;

/**
 * @author wgt
 * @date 2018-11-30
 * @description 原型模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 **/
public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student("tom", 10);

        Student student2 = (Student) student1.clone();

        System.out.println(student1.getName() + " " + student1.getAge());
        System.out.println(student2.getName() + " " + student2.getAge());

        System.out.println("student1 == student2:" + (student1 == student2));
    }
}
