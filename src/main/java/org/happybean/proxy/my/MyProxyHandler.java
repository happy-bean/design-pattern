package org.happybean.proxy.my;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wgt
 * @date 2018-11-26
 * @description
 **/
public class MyProxyHandler implements MyInvocationHandler {

    private Object object;

    public MyProxyHandler(Object object) {
        super();
        this.object = object;
    }

    @Override
    public void invoke(Object object, Method method) {
        try {
            System.out.println("开始代理...");
            method.invoke(this.object);
            System.out.println("代理结束");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
