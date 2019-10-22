package uestc.glb.design.structural.composite;

public class Course extends CatalogComponent{
    private String name;
    private int price;

    public Course(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("name:"+name+", price:"+price);
    }
}
