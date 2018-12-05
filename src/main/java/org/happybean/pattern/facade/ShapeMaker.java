package org.happybean.pattern.facade;

import org.happybean.pattern.decorator.Circle;
import org.happybean.pattern.decorator.Rectangle;
import org.happybean.pattern.decorator.Shape;

/**
 * @author wgt
 * @date 2018-12-05
 * @description
 **/
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
