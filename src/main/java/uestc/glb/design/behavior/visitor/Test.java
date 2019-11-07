package uestc.glb.design.behavior.visitor;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        Course freeCourse = new FreeCourse("JVM");
        Course codingCourse = new CodingCorse("Java 设计模式", 299);
        courses.add(freeCourse);
        courses.add(codingCourse);
        for (Course course : courses){
            course.accept(new Visitor());
        }
    }
}
