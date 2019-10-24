package uestc.glb.design.structural.proxy.staticproxy;

import uestc.glb.design.structural.proxy.Order;


public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        // 会根据id的值选择db路由
        order.setUserID(2);
        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy();
        staticProxy.saveOrder(order);
    }
}
