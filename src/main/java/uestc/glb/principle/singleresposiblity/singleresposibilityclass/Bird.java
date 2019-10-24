package uestc.glb1.principle.singleresposiblity.singleresposibilityclass;

public class Bird {
    // 在一个类里面就游用脚走和用翅膀飞两个职责
    public void move(String birdName){
        if(birdName.equals("鸵鸟"))
            System.out.println(birdName+ "用脚走");
        else
            System.out.println(birdName+ "用翅膀飞");
    }
}
