package uestc.glb1.design.creational.abstractfactory;

public class JavaCourseFactory implements CourseFacory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
