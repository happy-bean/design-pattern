package org.happybean.pattern.bridge;

/**
 * @author wgt
 * @date 2018-12-04
 * @description
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
