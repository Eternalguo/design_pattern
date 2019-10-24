package uestc.glb.design.structural.proxy;


/**
 * service层处理的对象
 */
public class Order {
    private Object OrderInfo;
    private Integer UserID;

    public Object getOrderInfo() {
        return OrderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        OrderInfo = orderInfo;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }
}
