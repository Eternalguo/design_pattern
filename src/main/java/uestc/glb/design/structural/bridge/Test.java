package uestc.glb.design.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Bank abcAccount = new ABCBank(new DepositAccount());
        abcAccount.openAccount();
        abcAccount.account.showAccount();

        Bank abcAccount2 = new ABCBank(new SavingAccount());
        abcAccount2.openAccount();
        abcAccount2.account.showAccount();

        Bank icbcAccount = new ICBCBank(new DepositAccount());
        icbcAccount.openAccount();
        icbcAccount.account.showAccount();
    }
}
