package org.happybean.pattern.template;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 模板模式
 **/
public class Template {

    public static void main(String[] args) {
        RefreshBeverage coffee = new Coffee();
        coffee.perpareBeverageTemplate();

        RefreshBeverage tea = new Tea();
        tea.perpareBeverageTemplate();
    }
}
