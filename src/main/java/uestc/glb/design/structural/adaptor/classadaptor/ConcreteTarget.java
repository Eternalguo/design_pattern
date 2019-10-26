package uestc.glb.design.structural.adaptor.classadaptor;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标接口方法");
    }
}
