package uestc.glb1.design.structural.facade;

public class PayService {
    public boolean pay(Gift gift){
        System.out.println("支付"+gift.getName()+"成功");
        return true;
    }
}
