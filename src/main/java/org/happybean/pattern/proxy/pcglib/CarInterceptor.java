package org.happybean.pattern.proxy.pcglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wgt
 * @date 2018-11-25
 * @description
 **/
public class CarInterceptor implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        //设置创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * @param o           被代理的对象
     * @param method      被代理的方法
     * @param objects     被代理方法的参数
     * @param methodProxy 代理类的实例
     * @return 被代理方法的返回值
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        methodProxy.invokeSuper(o, objects);
        long endTime = System.currentTimeMillis();
        System.out.println("行驶结束 行驶时间：" + (endTime - startTime) + "ms");

        return null;
    }
}
