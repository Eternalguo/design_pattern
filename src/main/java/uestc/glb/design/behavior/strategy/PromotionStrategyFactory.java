package uestc.glb.design.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> promotionStrategyMap = new HashMap<>();
    private PromotionStrategyFactory(){

    }
    static {
        promotionStrategyMap.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        promotionStrategyMap.put(PromotionKey.FANXIAN, new FanXianPromitionStrategy());
        promotionStrategyMap.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = promotionStrategyMap.get(promotionKey);
        // 防止空指针错误
        return promotionStrategy == null ? new EmptyPromotionStategy() : promotionStrategy;
    }

    interface PromotionKey{
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
        String LIJIAN = "LIJIAN";
    }
}
