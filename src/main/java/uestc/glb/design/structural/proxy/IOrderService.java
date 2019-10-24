package uestc.glb.design.structural.proxy;


/**
 * service层负责处理数据，调用dao层
 */
public interface IOrderService {
    // 传入一个订单，返回的是生效行数
    int saveOrder(Order order);
}
