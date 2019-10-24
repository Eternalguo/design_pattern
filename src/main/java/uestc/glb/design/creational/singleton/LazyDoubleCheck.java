package uestc.glb1.design.creational.singleton;

/**
 * 双重检查注重延迟加载和线程安全,减小锁对性能的消耗
 */
public class LazyDoubleCheck {
    // 保证不会被重排序
    private volatile static LazyDoubleCheck instance = null;
    private LazyDoubleCheck(){

    }
    public static LazyDoubleCheck getInstance(){
        if(instance == null){
            //双重检测是为了降低锁的范围，让尽量少的线程参与到锁竞争中
            synchronized(LazyDoubleCheck.class){
                if(instance == null)
                    instance = new LazyDoubleCheck();
                //1.分配内存
                //2.初始化内存
                //3.赋值
                //23步骤可能重排序，导致返回一个还未完全初始化好的对象
            }
        }
        return instance;
    }
}
