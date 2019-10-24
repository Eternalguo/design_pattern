package uestc.glb1.design.creational.factorymethod;


/**
 * 工厂方法模式核心在于，让对象的创建延迟到子类完成，工厂接口只定义创建产品的职责，
 * 具体的产品由具体产品工厂来创建，具体工厂实现工厂的职责
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.preduce();
        factory =new PythonVideoFactory();
        video = factory.getVideo();
        video.preduce();
    }
}
