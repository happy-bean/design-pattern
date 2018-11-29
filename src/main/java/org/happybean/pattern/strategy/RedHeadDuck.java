package org.happybean.pattern.strategy;

/**
 * @author wgt
 * @date 2018-11-28
 * @description
 **/
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色");
    }

    public static void main(String[] args) {
        Duck duck = new RedHeadDuck();
        duck.display();
        duck.fly();
    }
}
