package uestc.glb.design.structural.proxy.dynamicproxy;

import uestc.glb.design.structural.proxy.IOrderService;
import uestc.glb.design.structural.proxy.IOrderServiceImpl;
import uestc.glb.design.structural.proxy.Order;



public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        // 会根据id的值选择db路由
        order.setUserID(2);
        IOrderService dynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new IOrderServiceImpl()).bind();
        dynamicProxy.saveOrder(order);
    }
}
