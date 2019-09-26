package uestc.glb.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(96, "模式设计", 69d);
       JavaDiscountCourse discountCourse = (JavaDiscountCourse)course;
        System.out.println("课程ID：" + discountCourse.getId() + "，课程名词："+discountCourse.getName()+"，课程价格："+discountCourse.getPrice()+"，原价格："+discountCourse.getOriginalPrice());
    }
}
