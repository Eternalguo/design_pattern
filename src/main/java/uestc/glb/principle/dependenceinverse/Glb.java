package uestc.glb.principle.dependenceinverse;


public class Glb {
//    public void studyJavaCourse(){
//        System.out.println("Glb is studing JavaCourse");
//    }
//    public void studyPythonCourse(){
//        System.out.println("Glb is studing PythonCourse");
//    }
    private ICourse iCourse;
//    public Glb(ICourse iCourse){
//        this.iCourse = iCourse;
//    }
    public void study(){
        iCourse.studyCourse();
    }
    // 因为在spring框架中默认采用单例模式，只能通过构造器注入，没有堆外开放iCourse的注入，所以使用setter方法注入
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
