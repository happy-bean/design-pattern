package org.happybean.proxy;

import org.happybean.proxy.my.MyProxy;
import org.happybean.proxy.my.MyProxyHandler;
import org.happybean.proxy.pcglib.CarInterceptor;
import org.happybean.proxy.pjdk.TimeHandler;
import org.happybean.proxy.pstatic.CarProxy1;
import org.happybean.proxy.pstatic.CarProxy2;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wgt
 * @date 2018-11-25
 * @description 代理模式
 * 为其他对象提供一种代理，以控制对这个对象的访问，可去掉功能服务或增加功能服务
 **/
public class Proxy {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //静态代理
        Car car = new Car();
        Moveable car1 = new CarProxy1();
        car1.move();
        Moveable car2 = new CarProxy2(car);
        car2.move();

        //jdk动态代理
        Class<? extends Car> clazz = car.getClass();
        InvocationHandler handler = new TimeHandler(car);
        Moveable moveable
                = (Moveable) java.lang.reflect.Proxy
                .newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), handler);
        moveable.move();

        //cglib动态代理
        CarInterceptor interceptor = new CarInterceptor();
        moveable = (Moveable) interceptor.getProxy(car.getClass());
        moveable.move();

        //自定义动态代理
        MyProxyHandler proxyHandler = new MyProxyHandler(car);
        moveable = (Moveable) MyProxy.newProxyInstance(Moveable.class,proxyHandler);
        moveable.move();
    }
}
