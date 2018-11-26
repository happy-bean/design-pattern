package org.happybean.proxy.my;

import java.lang.reflect.Method;

/**
 * @author wgt
 * @date 2018-11-26
 * @description
 **/
public interface MyInvocationHandler {

    void invoke(Object object, Method method);
}
