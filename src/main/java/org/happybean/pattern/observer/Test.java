package org.happybean.pattern.observer;

import org.happybean.pattern.observer.jdk.TVObserver;
import org.happybean.pattern.observer.jdk.WeatherSubject;

/**
 * @author wgt
 * @date 2018-11-29
 * @description
 **/
public class Test {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observerA = new ConcreteObserver();

        Observer observerB = new ConcreteObserver();

        subject.attach(observerA);
        subject.attach(observerB);

        subject.setSubjectState("no");

        System.out.println(((ConcreteObserver)observerA).getObserverState());
        System.out.println(((ConcreteObserver)observerB).getObserverState());
        subject.setSubjectState("ok");

        System.out.println(((ConcreteObserver)observerA).getObserverState());
        System.out.println(((ConcreteObserver)observerB).getObserverState());

        WeatherSubject weatherSubject = new WeatherSubject();

        TVObserver observer = new TVObserver();
        observer.setObserverName("北京电视台");

        weatherSubject.addObserver(observer);
        weatherSubject.setContent("天气晴，气温16°");
    }
}
