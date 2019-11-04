package uestc.glb.design.behavior.mediator;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("glb");
        User user2 = new User("geely");
        user1.sendMessage("我们一起学习设计模式");
        user2.sendMessage("ok!");
    }
}
