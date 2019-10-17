package uestc.glb.design.structural.facade;

public class QualityService {
    public boolean isAvailable(Gift gift){
        System.out.println("校验"+ gift.getName()+"库存充足");
        return true;
    }
}
