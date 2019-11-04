package uestc.glb.design.behavior.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("设计模式");
        course.setArticle("手记");
        course.setVideo("视频");
        // 形成责任链，任务在责任链中从前往后处理
        Handler handler = new ArticleHandler();
        handler.setNextHandler(new VideoHandler());
        handler.deploy(course);
    }
}
