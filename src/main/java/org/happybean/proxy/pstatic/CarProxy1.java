package org.happybean.proxy.pstatic;

import org.happybean.proxy.Car;

/**
 * @author wgt
 * @date 2018-11-25
 * @description 继承方式
 **/
public class CarProxy1 extends Car {

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("行驶结束 行驶时间：" + (endTime - startTime) + "ms");
    }
}
