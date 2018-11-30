package org.happybean.pattern.factory.abstractt;

/**
 * @author wgt
 * @date 2018-11-30
 * @description
 **/
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
