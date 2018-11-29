package org.happybean.pattern.factory;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 发型工厂
 **/
public class HairFactory {

    public static Hair getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        } else {
            return null;
        }
    }

    public static Hair getLeftHair() {
        return new LeftHair();
    }

    public static Hair getRightHair() {
        return new RightHair();
    }
}
