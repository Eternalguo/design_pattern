package uestc.glb.design.behavior.strategy;

public class FanXianPromitionStrategy implements PromotionStrategy {
    @Override
    public void promote() {
        System.out.println("返现促销策略");
    }
}
