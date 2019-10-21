package uestc.glb.flyweight;

/**
 * 享元模式重在共享对象
 */
public class Test {
    public static void main(String[] args) {
        String[] departments = new String[]{"RD", "QA", "PM"};
        for (int i = 0; i < 10; i++) {
            String department = departments[(int)(Math.random()*departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
