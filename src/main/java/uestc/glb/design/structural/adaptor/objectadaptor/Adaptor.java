package uestc.glb.design.structural.adaptor.objectadaptor;

/**
 * 通过适配器将adaptee的adapteeRequest()方法适配为target的request()方法， 对象适配器是通过对象的组合来实现的
 */
public class Adaptor implements Target {
    Adaptee adaptee = new ConcreteAdaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
