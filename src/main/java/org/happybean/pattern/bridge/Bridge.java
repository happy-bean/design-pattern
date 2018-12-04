package org.happybean.pattern.bridge;

/**
 * @author wgt
 * @date 2018-12-04
 * @description 桥接模式
 * 是用于把抽象化与实现化解耦，使得二者可以独立变化
 **/
public class Bridge {

    public static void main(String[] args) {
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        greenCircle.draw();
    }
}
