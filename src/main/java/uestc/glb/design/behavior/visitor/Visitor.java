package uestc.glb.design.behavior.visitor;

/**
 * 访问者具体实现，根据不同的访问对象对数据产生不同的访问行为
 */
public class Visitor implements IVisitor{

    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程："+course.getName());
    }

    @Override
    public void visit(CodingCorse course) {
        System.out.println("收费课程： "+course.getName()+"，价格："+course.getPrice());
    }
}
