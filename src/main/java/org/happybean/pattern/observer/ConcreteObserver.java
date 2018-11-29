package org.happybean.pattern.observer;

/**
 * @author wgt
 * @date 2018-11-29
 * @description 具体的观察者对象，实现更新方法，使自身状态和目标的状态一致
 **/
public class ConcreteObserver implements Observer {

    private String observerState;

    /**
     * 获取目标类的状态到观察者的状态中
     */
    @Override
    public void update(Subject subject) {
        this.observerState = ((ConcreteSubject) subject).getSubjectState();
    }

    public String getObserverState() {
        return observerState;
    }
}
