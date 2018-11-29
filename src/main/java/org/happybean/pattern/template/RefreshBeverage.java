package org.happybean.pattern.template;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 提神饮料
 **/
public abstract class RefreshBeverage {

    /**
     * 制作饮料模板方法
     */
    public final void perpareBeverageTemplate() {
        //1.水煮沸
        boilWater();
        //2.泡制饮料
        brew();
        //3.将饮料倒入杯子
        pourInCup();

        if (needCondiments()) {
            //4.加入调味料
            addCondiments();
        }
    }

    /**
     * 是否需要加调味料
     */
    protected boolean needCondiments() {
        return true;
    }

    protected abstract void boilWater();


    private void brew() {
        System.out.println("泡制饮料");
    }

    private void pourInCup() {
        System.out.println("将饮料倒入杯子");
    }

    protected abstract void addCondiments();
}
