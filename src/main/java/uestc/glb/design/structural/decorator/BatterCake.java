package uestc.glb.design.structural.decorator;

public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int getCost() {
        return 8;
    }
}
