package uestc.glb.design.structural.proxy;


public class IOrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;
    @Override
    public int saveOrder(Order order) {
        // 使用spring时，会自动注入无需手动new
        iOrderDao = new IOrderDaoImpl();
        System.out.println("service层调用dao添加order成功");
        return iOrderDao.insert(order);
    }
}
