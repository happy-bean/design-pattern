package org.happybean.pattern.facade;

/**
 * @author wgt
 * @date 2018-12-05
 * @description 外观模式
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 **/
public class Facade {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
