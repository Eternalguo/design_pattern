package uestc.glb1.design.structural.facade;

/**
 * 外观模式对外提供统一的接口访问子系统的接口，比如例子中的礼物兑换接口提供了统一的访问接口exchangeGift，
 * 由GiftExchangeService类与其他子系统接口交互，客户端不直接与子系统中的接口交互
 */
public class Test {
    public static void main(String[] args) {
        Gift gift = new Gift("耳机");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.exchangeGift(gift);
    }
}
