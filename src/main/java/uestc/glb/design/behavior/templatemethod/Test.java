package uestc.glb.design.behavior.templatemethod;

public class Test {
    public static void main(String[] args) {
        ACourse designPatternCourse = new DesignPattern();
        designPatternCourse.makeCourse();

        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
    }
}
