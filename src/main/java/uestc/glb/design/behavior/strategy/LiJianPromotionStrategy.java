package uestc.glb.design.behavior.strategy;

public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void promote() {
        System.out.println("立减促销策略");
    }
}
