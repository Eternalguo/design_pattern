package uestc.glb1.principle.demeter;

public class Boss {
    // Boss类应该和朋友类交流，不应该和陌生的类说话，朋友类即是成员变量类、方法输入参数类、方法返回参数类，次情况下
    // Boss只应该和TeamLeader交流
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumber();
    }
}
