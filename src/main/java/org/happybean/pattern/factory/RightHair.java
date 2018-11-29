package org.happybean.pattern.factory;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 右偏分发型
 **/
public class RightHair implements Hair{

    @Override
    public void draw() {
        System.out.println("右偏分发型");
    }
}
