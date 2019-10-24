package uestc.glb.design.structural.proxy.dynamicproxy;

import uestc.glb.design.structural.proxy.Order;
import uestc.glb.design.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * jdk动态代理只能对接口进行代理，利用反射机制在程序运行期间动态创建代理对象，调用其方法，并为其增强
 * 通过bind创建的代理对象实现了被代理类的接口，所有可以通过代理类直接调用接口的方法，而代理类的接口方法的
 * 执行会转到代理类的invoke逻辑中执行，invoke方法的参数分别是：代理类、要执行的方法、方法的参数，通过
 * Method的invoke方法将承接代理类中需要在被代理类中执行的逻辑。
 *
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }
    public Object bind(){
        Class cls = target.getClass();
        // 返回一个代理对象
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        // 调用被代理对象的method方法，target为目标对象，args为传入方法的参数
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }
    /**
     * 在被代理对象方法执行之前增强
     */
    private void beforeMethod(Object order){
        System.out.println("动态代理before method code");
        if(order instanceof Order) {
            int userId = ((Order)order).getUserID();
            // 根据userID进行数据库分库
            int dbRouter = userId % 2;
            System.out.println("动态代理分配到db[" + dbRouter + "]处理数据");
            DataSourceContextHolder.setDBType("db" + dbRouter);
        }
    }
    /**
     * 在被代理对象方法执行之后增强
     */
    private void afterMethod(){
        System.out.println("动态代理after method code");
    }
}
