package uestc.glb1.design.creational.singleton;

/**
 * 使用空间换时间的方式实现线程内的单例模式，但线程间不满足
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){

    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    } ;

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}
