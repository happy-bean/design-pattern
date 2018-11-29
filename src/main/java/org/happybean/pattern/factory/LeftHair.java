package org.happybean.pattern.factory;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 左偏分发型
 **/
public class LeftHair implements Hair{

    @Override
    public void draw() {
        System.out.println("左偏分发型");
    }
}
