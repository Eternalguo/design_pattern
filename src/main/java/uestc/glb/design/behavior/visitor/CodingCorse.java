package uestc.glb.design.behavior.visitor;

public class CodingCorse extends Course {
    private int price;
    public CodingCorse(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
