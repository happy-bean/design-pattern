package org.happybean.pattern.observer;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 观察者模式
 * 定义对象间的一种一对多的依赖关系。当一个对象的状态发生改变时，
 * 所有依赖他的对象都得到通知并被自动更新
 **/
public interface Observer {

    /**
     * 更新接口
     *
     * @param subject
     */
    void update(Subject subject);
}
