package org.happybean.pattern.singleton;

/**
 * @author wgt
 * @date 2018-11-25
 * @description 饿汉模式
 **/
public class Hungry {

    private Hungry() {

    }

    private static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

    public void call() {
        System.out.println("i am hungry");
    }
}
