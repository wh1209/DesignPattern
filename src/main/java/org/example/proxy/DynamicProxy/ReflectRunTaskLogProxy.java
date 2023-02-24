package org.example.proxy.DynamicProxy;

import org.example.proxy.RunTask;
import org.example.proxy.Task;

import java.lang.reflect.Proxy;

/**
 * 分离代理行为与被代理对象
 * 动态代理，jdk反射实现，想让proxy可以重用，可以代理任何其他类型
 * 缺点：被代理类必须实现某个接口
 */
public class ReflectRunTaskLogProxy {


    public static void main(String[] args) {
        Task task = new RunTask();

//        System.getProperties().put("jdk.proxy", )

        //reflection,通过字节码分析类的成员变量和方法
        Task t = (Task) Proxy.newProxyInstance(RunTask.class.getClassLoader(),
                new Class[]{Task.class},
                new LogHandler(task));
    }
}
