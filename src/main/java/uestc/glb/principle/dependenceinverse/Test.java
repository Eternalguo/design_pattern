package uestc.glb1.principle.dependenceinverse;
// 依赖倒置原则要求高层模块不应该依赖底层模块
// Test是堆外的应用层，是相对较高的层次
public class Test {
    public static void main(String[] args) {
//        V1中，高层的Test的实现依赖于Glb的具体实现，Test使用的方法都需要区Glb中扩展才能使用
//        Glb glb1 = new Glb();
//        glb1.studyJavaCourse();
//        glb1.studyPythonCourse();
//        V2中，Test高层模块是和底层模块Glb解耦的，由高层模块选择对应的逻辑，需要增加更多的课程时，只需实现Icourse接口实现其方法扩展
//        Glb glb1 = new Glb();
//        glb1.study(new JavaCourse());
//        glb1.study(new PythonCourse());
//        V3中，只能通过构造器注入，没有对外开放iCourse的注入，所以使用setter方法注入
//        Glb glb1 = new Glb(new JavaCourse());
//        glb1.study();
//        Glb glb2 = new Glb(new PythonCourse());
//        glb2.study();
        Glb glb = new Glb();
        glb.setiCourse(new JavaCourse());
        glb.study();
        glb.setiCourse(new PythonCourse());
        glb.study();
    }
}
