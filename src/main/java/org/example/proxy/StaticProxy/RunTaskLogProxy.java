package org.example.proxy.StaticProxy;

import org.example.proxy.Task;


/**
 * 静态代理
 * 优点：可以在不修改目标类的前提下，扩展目标类的功能
 * 缺点：
 * - 冗余，由于代理对象要实现和目标对象一致的接口，会产生很多的代理类
 * - 不易维护，一旦接口增加方法，代理类和目标类都要修改
 */
public class RunTaskLogProxy implements Task {
    private Task task;

    public RunTaskLogProxy(Task task) {
        this.task = task;
    }
    @Override
    public void exec() {
        System.out.println("task exec start");

        task.exec();

        System.out.println("task exec end");
    }
}
