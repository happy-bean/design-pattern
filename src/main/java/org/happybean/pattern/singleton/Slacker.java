package org.happybean.pattern.singleton;

/**
 * @author wgt
 * @date 2018-11-25
 * @description 懒汉模式
 **/
public class Slacker {

    private Slacker(){

    }

    private static Slacker slacker;

    public static Slacker getInstance() {
        if(slacker==null){
            slacker = new Slacker();
        }
        return slacker;
    }

    public void call() {
        System.out.println("i am slacker");
    }
}
