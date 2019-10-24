package uestc.glb.design.structural.proxy.staticproxy;

import uestc.glb.design.structural.proxy.IOrderServiceImpl;
import uestc.glb.design.structural.proxy.IOrderService;
import uestc.glb.design.structural.proxy.Order;
import uestc.glb.design.structural.proxy.db.DataSourceContextHolder;


/**
 * 静态代理是在类中显示的指定代理
 */
public class OrderServiceStaticProxy {
    // 需要对代理的对象注入，进行增强
    private IOrderService iOrderService;
    public int saveOrder(Order order){
        beforeMethod(order);
        // 使用spring则无需手动new
        iOrderService = new IOrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    /**
     * 在被代理对象方法执行之前增强
     */
    private void beforeMethod(Order order){
        System.out.println("静态代理before method code");
        int userId = order.getUserID();
        // 根据userID进行数据库分库
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到db["+dbRouter+"]处理数据");
        DataSourceContextHolder.setDBType("db"+dbRouter);
    }
    /**
     * 在被代理对象方法执行之后增强
     */
    private void afterMethod(){
        System.out.println("静态代理after method code");
    }
}
