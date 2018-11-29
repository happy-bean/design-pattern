package org.happybean.pattern.template;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 子类-咖啡
 **/
public class Coffee extends RefreshBeverage{

    @Override
    protected void boilWater() {
        System.out.println("沸水冲泡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖，牛奶");
    }
}
