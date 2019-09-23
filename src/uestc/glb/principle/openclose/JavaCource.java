package uestc.glb.principle.openclose;

public class JavaCource implements ICourse{
    private Integer ID;
    private String name;
    private Double price;

    public JavaCource(Integer ID, String name, Double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
