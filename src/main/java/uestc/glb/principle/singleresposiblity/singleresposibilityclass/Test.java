package uestc.glb1.principle.singleresposiblity.singleresposibilityclass;

public class Test {
    public static void main(String[] args) {
        // WalkBird的职责是用脚走来移动
        WalkBird bird = new WalkBird();
        bird.move("鸵鸟");
        // FlyBird的职责是用翅膀飞来移动
        FlyBird bird1 = new FlyBird();
        bird1.move("大雁");
    }
}
