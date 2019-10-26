package uestc.glb.design.structural.adaptor.classadaptor;

import uestc.glb.design.structural.adaptor.objectadaptor.ConcreteAdaptee;

/**
 * 通过适配器将adaptee的adapteeRequest()方法适配为target的request()方法， 类适配器是通过继承类来实现的
 */
public class Adaptor extends ConcreteAdaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
