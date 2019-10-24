package uestc.glb1.design.creational.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, InterruptedException {
//        LazySingleton instance = LazySingleton.getInstance();
//        System.out.println("program end");
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");
//        HungrySington instance = HungrySington.getInstance();
//        EnumSingleton instance = EnumSingleton.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
////        HungrySington newInstancee = (HungrySington) ois.readObject();
//        EnumSingleton newInstancee = (EnumSingleton) ois.readObject();
//        System.out.println(instance.getData());
//        System.out.println(newInstancee.getData());
//        System.out.println(instance.getData() == newInstancee.getData());
//        Class clazz = HungrySington.class;
////        Class clazz = Class.forName(HungrySington.class.getName());
//        Constructor c = clazz.getDeclaredConstructor();
//        // 打开构造器的权限
//        c.setAccessible(true);
//        HungrySington instance = HungrySington.getInstance();
//        HungrySington newInstance = (HungrySington) c.newInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
//        EnumSingleton newInstance = EnumSingleton.getInstance();
//        newInstance.print();
//        Class clazz = EnumSingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        EnumSingleton instance = (EnumSingleton) constructor.newInstance("glb1", 666);
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println("program end");
    }
}
