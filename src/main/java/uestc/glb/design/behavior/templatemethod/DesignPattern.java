package uestc.glb.design.behavior.templatemethod;

public class DesignPattern extends ACourse {
    @Override
    protected void packageCourse() {
        System.out.println("提供原代码");
    }

    @Override
    protected boolean needMakeArticle() {
        return true;
    }
}
