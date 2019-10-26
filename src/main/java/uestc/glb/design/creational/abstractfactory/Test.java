package uestc.glb.design.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFacory factory = new JavaCourseFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();
        video.produce();
        article.produce();
    }
}
