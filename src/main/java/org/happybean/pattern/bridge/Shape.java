package org.happybean.pattern.bridge;

/**
 * @author wgt
 * @date 2018-12-04
 * @description
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
