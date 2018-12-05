package org.happybean.pattern.flyweight;

import org.happybean.pattern.decorator.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wgt
 * @date 2018-12-05
 * @description
 **/
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
