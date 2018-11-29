package org.happybean.pattern.template;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 子类-茶
 **/
public class Tea extends RefreshBeverage {

    @Override
    protected void boilWater() {
        System.out.println("80°水冲泡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    /**
     * 钩子-采用重写父类方法控制流程
     */
    @Override
    protected boolean needCondiments() {
        return false;
    }
}
