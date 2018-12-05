package org.happybean.pattern.decorator;

/**
 * @author wgt
 * @date 2018-12-05
 * @description
 **/

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
