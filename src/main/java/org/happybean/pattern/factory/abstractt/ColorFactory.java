package org.happybean.pattern.factory.abstractt;

/**
 * @author wgt
 * @date 2018-11-30
 * @description
 **/
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        return null;
    }
}
