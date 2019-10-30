package uestc.glb.design.behavior.strategy;

public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new FanXianPromitionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new LiJianPromotionStrategy());
//
//        promotionActivity618.executePromotion();
//        promotionActivity1111.executePromotion();
//    }
    public static void main(String[] args) {
        // 使用一个促销策略工厂来生成策略
        PromotionActivity promotionActivity618 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("MANJIAN"));
        PromotionActivity promotionActivity1111 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("LIJIAN"));

        promotionActivity618.executePromotion();
        promotionActivity1111.executePromotion();
    }
}
