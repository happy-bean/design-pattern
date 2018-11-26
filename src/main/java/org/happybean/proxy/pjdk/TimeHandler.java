package org.happybean.proxy.pjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wgt
 * @date 2018-11-25
 * @description 动态代理
 **/
public class TimeHandler implements InvocationHandler {

    private Object object;

    public TimeHandler(Object object) {
        super();
        this.object = object;
    }

    /**
     * @param proxy  被代理的对象
     * @param method 被代理的方法
     * @param args   被代理方法的参数
     * @return 被代理方法的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        method.invoke(object);
        long endTime = System.currentTimeMillis();
        System.out.println("行驶结束 行驶时间：" + (endTime - startTime) + "ms");

        return null;
    }
}
