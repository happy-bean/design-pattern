package org.happybean.pattern.proxy.pstatic;

import org.happybean.pattern.proxy.Car;
import org.happybean.pattern.proxy.Moveable;

/**
 * @author wgt
 * @date 2018-11-25
 * @description 聚合方式 优选
 **/
public class CarProxy2 implements Moveable {

    private Car car;

    public CarProxy2(Car car) {
        super();
        this.car = car;
    }

    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        this.car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("行驶结束 行驶时间：" + (endTime - startTime) + "ms");
    }
}
