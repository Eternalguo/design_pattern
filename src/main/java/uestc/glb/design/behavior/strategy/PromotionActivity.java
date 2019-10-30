package uestc.glb.design.behavior.strategy;

public class PromotionActivity {
    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotion(){
        promotionStrategy.promote();
    }
}
