package uestc.glb.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Employee工厂，共享Employee对象
 */
public class EmployeeFactory {
    private static final Map<String, Employee> map = new HashMap<>();
    public static Employee getManager(String department){
        Manager manager = (Manager) map.get(department);
        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建"+department+"经理");
            manager.setReportContent(department+", 部门汇报， 汇报内容是......");
            String report = manager.getReportContent();
            System.out.println(report);
            map.put(department, manager);
        }
        return manager;
    }
}
