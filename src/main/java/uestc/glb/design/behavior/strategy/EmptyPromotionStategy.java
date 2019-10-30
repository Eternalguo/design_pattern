package uestc.glb.design.behavior.strategy;

public class EmptyPromotionStategy implements  PromotionStrategy{
    @Override
    public void promote() {
        System.out.println("无促销");
    }
}
