package uestc.glb1.principle.openclose;

/**
 * 使用开闭原则，通过继承基类，对扩展是开放的对修改基类和接口是关闭的，修改的都是应用的子类，层次越高的模块的修改产生的影响越大
 */
public class JavaDiscountCourse extends JavaCource {
    public JavaDiscountCourse(Integer ID, String name, Double price) {
        super(ID, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    public Double getOriginalPrice(){
        return super.getPrice();
    }

}
