package uestc.glb.design.creational.singleton;

/**
 * 通过反编译工具jad可以清楚的看到枚举类的具体实现
 */
// 这个枚举类申明相当于public class EnumSingleton extends Enum
    // 综合看来，枚举类的实现很符合单例模式的规则
public enum EnumSingleton {
    // 枚举类会自动生成private的构造器，private EnumSingleton(String s, int i)
    // 这个INSTANCE会被自动处理为public static final EnumSingleton INSTANCE，这也就是为什么
    // 在其他地方可以直接使用枚举类的值
    INSTANCE {
        // 申明枚举类的方法
        protected void print(){
            System.out.println("glb");
        }
    };
    protected abstract void print();
    // 我们自己申明的枚举类的示例变量
    private Object data;
    // 同时枚举类还会自己生成一个private static final EnumSingleton $VALUES[]的数组用于存放枚举
    // 所有值，枚举类型自动生成静态代码块:
    // static{INSTANCE = new EnumSingleton("INSTANCE"， 0)；$VALUES[] = new EnumSingleton[]{INSTANCE};}
    // 枚举类同样会自动生成方法：
    /*public static EnumSingleton[] values()
    {
        return (EnumSingleton[])$VALUES.clone();
    }

    public static EnumSingleton valueOf(String name)
    {
        return (EnumSingleton)Enum.valueOf(uestc/glb/design/creational/singleton/EnumSingleton, name);
    }*/
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
