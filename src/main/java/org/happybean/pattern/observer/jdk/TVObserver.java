package org.happybean.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wgt
 * @date 2018-11-29
 * @description
 **/
public class TVObserver implements Observer {

    /**
     * 观察者名称
     */
    private String observerName;

    @Override
    public void update(Observable o, Object arg) {
        //推的方式
        System.out.println(observerName + "get message：" + arg);
        //拉的方式
        System.out.println(observerName + "get message：" + ((WeatherSubject) o).getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
