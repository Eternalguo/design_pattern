package uestc.glb.design.structural.proxy;


/**
 * dao层负责数据的插入删除等
 */
public interface IOrderDao {
    int insert(Order order);
}
