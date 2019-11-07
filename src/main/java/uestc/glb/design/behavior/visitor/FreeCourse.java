package uestc.glb.design.behavior.visitor;

public class FreeCourse extends  Course{
    public FreeCourse(String name) {
        super(name);
    }
    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
