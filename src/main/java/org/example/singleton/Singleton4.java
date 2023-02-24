package org.example.singleton;

/**
 * DCL双重校验
 * volatile，禁止指令重排序，防止成员变量赋初始值和将对象的引用赋给obj发生指令重排，将为只赋默认值的的instance返回。
 */
public class Singleton4 {

    private static volatile Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized(Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
