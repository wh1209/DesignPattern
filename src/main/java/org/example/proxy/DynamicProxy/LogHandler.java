package org.example.proxy.DynamicProxy;

import org.example.proxy.Task;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    private Task task;

    public LogHandler(Task task) {
        this.task = task;
    }

    /**
     * proxy,代理类的对象
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("task exec start");

        Object obj = method.invoke(task, args);

        System.out.println("task exec end");
        return obj;
    }
}
