package uestc.glb1.design.structural.adaptor.classadaptor;

public class ConcreteAdaptee implements Adaptee {
    @Override
    public void adapteeRequest() {
        System.out.println("被适配者方法");
    }
}
