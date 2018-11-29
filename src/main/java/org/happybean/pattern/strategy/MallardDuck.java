package org.happybean.pattern.strategy;

/**
 * @author wgt
 * @date 2018-11-28
 * @description
 **/
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我是绿色");
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
    }
}
