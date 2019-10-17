package uestc.glb.design.structural.facade;

public class OrderService {
    public String order(Gift gift){
        String orderNo = "123";
        System.out.println(gift.getName() + "下单成功, 订单号是："+orderNo);
        return orderNo;
    }
}
