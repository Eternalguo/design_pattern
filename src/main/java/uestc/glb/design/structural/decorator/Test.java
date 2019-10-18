package uestc.glb.design.structural.decorator;

public class Test {
    public static void main(String[] args) {
        ABatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " " + batterCake.getCost());
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getDesc()+" " + batterCake.getCost());
    }
}
