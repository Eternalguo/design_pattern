package uestc.glb.design.structural.proxy;


public class IOrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("dao层添加order成功");
        return 1;
    }
}
