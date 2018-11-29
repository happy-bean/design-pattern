package org.happybean.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 目标对象，知道他的观察者，并提供注册（添加）和删除观察者的接口
 **/
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除集合中指定观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers() {
        observers.stream().forEach(observer -> {
            observer.update(this);
        });
    }
}
