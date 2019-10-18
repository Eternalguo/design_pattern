package uestc.glb.design.structural.decorator;

public class SausageDecorator extends Adecorator {
    public SausageDecorator(ABatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加肠";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }

    @Override
    protected void doSomething() {

    }
}
