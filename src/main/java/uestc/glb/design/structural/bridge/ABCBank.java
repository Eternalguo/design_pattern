package uestc.glb.design.structural.bridge;

/**
 * 抽象类的扩展类
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开一个农业银行账号");
        account.openAccount();
        return account;
    }

    @Override
    public void save() {
        System.out.println("向账户里存入money");
    }

}
