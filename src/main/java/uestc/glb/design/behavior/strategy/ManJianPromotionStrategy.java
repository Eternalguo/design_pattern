package uestc.glb.design.behavior.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void promote() {
        System.out.println("满减促销策略");
    }
}
