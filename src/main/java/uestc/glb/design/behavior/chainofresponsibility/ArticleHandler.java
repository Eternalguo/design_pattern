package uestc.glb.design.behavior.chainofresponsibility;

public class ArticleHandler extends Handler {
    @Override
    public void deploy(Course course) {
        if(course.getArticle() != null && !course.getArticle().isEmpty()){
            System.out.println(course.getName() + "含有手记，批准");
            if(this.handler != null){
                this.handler.deploy(course);
            }
        }else{
            System.out.println("不含手记，不批准，流程结束");
            return;
        }
    }
}
