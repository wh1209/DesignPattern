package org.example.proxy.StaticProxy;

import org.example.proxy.Task;

public class RunTaskTimeProxy implements Task {
    private Task task;

    public RunTaskTimeProxy(Task task) {
        this.task = task;
    }

    @Override
    public void exec() {
        long start = System.currentTimeMillis();

        task.exec();

        long end = System.currentTimeMillis();
        long time = end - start;
    }
}
