package org.happybean.singleton;

/**
 * @author wgt
 * @date 2018-11-25
 * @description 单例模式
 * 懒汉模式饿汉模式区别：
 * 懒汉模式：类加载时加载创建类实例，获取对象快
 * 饿汉模式：使用时创建，类加载速度快
 **/
public class Singleton {

    public static void main(String[] args) {
        Hungry hungry = Hungry.getInstance();
        hungry.call();
    }
}
