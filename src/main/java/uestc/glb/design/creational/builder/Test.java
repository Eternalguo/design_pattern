package uestc.glb1.design.creational.builder;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java").buildCoursePPT("java PPT").buildCourseVideo("java Video").build();
        System.out.println(course);
    }
}
