package uestc.glb.design.structural.decorator;

public class EggDecorator extends Adecorator {
    // 因为父类没有无参构造器，需要显示调用
    public EggDecorator(ABatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 1;
    }

    @Override
    protected void doSomething() {

    }
}
