package org.happybean.pattern.observer;

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
    }
}
