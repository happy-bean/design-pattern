package org.happybean.pattern.observer.jdk;

import java.util.Observable;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 天气电视台 使用jdk实现
 **/
public class WeatherSubject extends Observable {

    /**
     * 天气情况
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        //主动通知 推的方式
        this.notifyObservers(content);
        //被动，拉的方式
        //this.notifyObservers();
    }
}
