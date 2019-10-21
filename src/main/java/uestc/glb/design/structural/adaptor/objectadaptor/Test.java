package uestc.glb.design.structural.adaptor.objectadaptor;

public class Test {
    public static void main(String[] args) {
        Target adaptorTarget = new Adaptor();
        adaptorTarget.request();
    }
}
