package org.happybean.pattern.factory.abstractt;

/**
 * @author wgt
 * @date 2018-11-30
 * @description 抽象工厂模式
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 **/
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
}
