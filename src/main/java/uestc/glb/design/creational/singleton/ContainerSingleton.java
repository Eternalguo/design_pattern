package uestc.glb1.design.creational.singleton;


import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式符合统一管理多个单例节省资源的场景，但是存在线程安全问题
 */
public class ContainerSingleton {
    public static Map<String, Object> instanceMap = new HashMap<>();

    private ContainerSingleton(){

    }

    public static void putInstance(String key, Object instance){
        if(!instanceMap.containsKey(key)){
            instanceMap.put(key, instance);
        }
    }
    public static Object getInstance(String key){
        return instanceMap.get(key);
    }
}
