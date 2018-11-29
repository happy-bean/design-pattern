package org.happybean.pattern.observer;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 具体的目标对象，负责把有关状态存到相应的观察者中
 **/
public class ConcreteSubject extends Subject {

    /**
     * 目标对象的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
