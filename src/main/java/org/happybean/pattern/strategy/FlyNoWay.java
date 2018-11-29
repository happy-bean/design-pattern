package org.happybean.pattern.strategy;

/**
 * @author wgt
 * @date 2018-11-29
 * @description
 **/
public class FlyNoWay implements FlyingStrategy{

    @Override
    public void performFly() {
        System.out.println("不会飞");
    }
}
