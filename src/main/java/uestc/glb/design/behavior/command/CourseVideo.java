package uestc.glb.design.behavior.command;

public class CourseVideo {
    private String courseName;

    public CourseVideo(String courseName) {
        this.courseName = courseName;
    }

    public void open(){
        System.out.println(courseName+"开放");
    }
    public void close(){
        System.out.println(courseName + "关闭");
    }
}
