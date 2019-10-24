package uestc.glb.design.structural.proxy.db;

/**
 * 当前线程的上下文
 *
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();
    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }
    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }
}
