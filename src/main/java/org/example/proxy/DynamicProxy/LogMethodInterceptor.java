package org.example.proxy.DynamicProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class LogMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("task exec start");

        Object obj = methodProxy.invokeSuper(o, objects);

        System.out.println("task exec end");
        return obj;
    }
}


