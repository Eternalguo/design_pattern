package uestc.glb.design.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式，很饥饿，在类加载时想吃东西，直接初始化完成，线程安全，但是不是延迟加载
 */
public class HungrySington implements Serializable {
    // 类加载阶段就会初始化好instance
    private final static HungrySington instance = new HungrySington();

    private HungrySington(){
        if(instance != null){
            throw new RuntimeException("单例构造器禁止反射调用！");
        }
    }

    public static HungrySington getInstance(){
        return instance;
    }
    // 解决序列化和反序列化安全问题，防止序列化后反序列化后不是同一个对象
    public Object readResolve(){
        return instance;
    }
}
