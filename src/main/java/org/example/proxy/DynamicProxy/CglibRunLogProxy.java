package org.example.proxy.DynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import org.example.proxy.RunTask;
import org.example.proxy.Task;

/**
 * 动态代理，cglib实现
 * - 不需要接口，但不能代理final类
 */
public class CglibRunLogProxy {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RunTask.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Task task = (Task)enhancer.create();
        task.exec();
    }
}
