package org.happybean.pattern.decorator;

/**
 * @author wgt
 * @date 2018-12-05
 * @description
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
