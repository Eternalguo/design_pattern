package uestc.glb.design.behavior.visitor;

/**
 * 访问者的抽象接口
 */
public interface IVisitor {
    void visit(FreeCourse course);
    void visit(CodingCorse course);
}
