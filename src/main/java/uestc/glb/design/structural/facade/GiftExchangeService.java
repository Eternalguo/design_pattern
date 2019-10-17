package uestc.glb.design.structural.facade;

/**
 * 礼物兑换的对外统一服务类
 */
public class GiftExchangeService {
    QualityService qualityService = new QualityService();
    PayService payService = new PayService();
    OrderService orderService = new OrderService();

    public void exchangeGift(Gift gift){
        qualityService.isAvailable(gift);
        payService.pay(gift);
        orderService.order(gift);
        System.out.println("商品兑换成功！");
    }
}
