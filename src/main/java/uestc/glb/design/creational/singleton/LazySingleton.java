package uestc.glb.design.creational.singleton;

/**
 * 懒汉单例模式注重延迟加载，调用getInstance时才加载，只有在使用的时候再加载初始化
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){

    }
    public synchronized static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
