package uestc.glb.design.structural.bridge;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        account.openAccount();
        System.out.println("打开一个工商银行账号");
        return account;
    }

    @Override
    public void save() {
        System.out.println("向账户中存入money");
    }
}
