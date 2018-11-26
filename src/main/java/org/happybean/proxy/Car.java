package org.happybean.proxy;

/**
 * @author wgt
 * @date 2018-11-25
 * @description
 **/
public class Car implements Moveable {

    public void move() {
        try {
            Thread.sleep(1000);
            System.out.println("行驶中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
