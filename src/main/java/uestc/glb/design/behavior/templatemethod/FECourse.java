package uestc.glb.design.behavior.templatemethod;

public class FECourse extends ACourse {
    @Override
    protected void packageCourse() {
        System.out.println("提供原代码");
        System.out.println("提供前端素材");
    }
}
