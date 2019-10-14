package uestc.glb.design.creational.singleton;

/**
 * 基于静态内部类的类初始化的延迟加载解决方案，JVM在执行类的初始化阶段会去获取一个类的初始化锁，这个锁可以同步
 * 多个线程对一类的初始化
 */
public class StaticInnerSington {
    private StaticInnerSington(){

    }

    /**
     * 当类的静态成员变量被访问时，会被加载、验证、准备、解析、初始化静态内部类，在初始化时当前线程会申请初始化锁
     */
    private static class InnerClass{
        private static StaticInnerSington instance = new StaticInnerSington();
    }
    public static StaticInnerSington getInstance(){
        return InnerClass.instance;
    }
}
