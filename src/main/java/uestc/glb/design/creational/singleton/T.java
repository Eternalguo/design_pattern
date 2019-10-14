package uestc.glb.design.creational.singleton;

public class T implements Runnable{
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheck lazyDoubleCheck = LazyDoubleCheck.getInstance();
//        HungrySington hungrySington = HungrySington.getInstance();
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
