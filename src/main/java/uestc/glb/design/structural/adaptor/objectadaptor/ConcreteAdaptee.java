package uestc.glb.design.structural.adaptor.objectadaptor;

public class ConcreteAdaptee implements Adaptee {
    @Override
    public void adapteeRequest() {
        System.out.println("被适配者方法");
    }
}
