package uestc.glb1.design.structural.decorator;

/**
 * 声明为抽象装饰类是为了添加一个protected doSomething抽象方法，所有具体装饰类都需实现此方法完成一个统一的
 * 装饰任务，如果没有这个需求则可将装饰类申明为具体类
 * 继承ABatterCake，装饰着装饰完了还是原对象类型
 */
public abstract class Adecorator extends ABatterCake{
    private ABatterCake batterCake;
    public Adecorator(ABatterCake batterCake){
        this.batterCake = batterCake;
    }

    @Override
    protected String getDesc() {
        return batterCake.getDesc();
    }

    @Override
    protected int getCost() {
        return batterCake.getCost();
    }
    // 所有的装饰者
    protected abstract void doSomething();
}
