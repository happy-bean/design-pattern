package org.happybean.pattern.strategy;

/**
 * @author wgt
 * @date 2018-11-28
 * @description
 **/
public abstract class Duck {

    private FlyingStrategy flyingStrategy;

    /**
     * 叫声
     */
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    /**
     * 外观
     */
    public abstract void display();

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly() {
        flyingStrategy.performFly();
    }
}
