package uestc.glb.design.structural.bridge;

/**
 * 桥接模式的抽象类，抽象类与具体业务实现直接通过组合这种桥梁来组合起来，使得抽象类和实现类都可以独立地扩展
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract Account openAccount();
    public abstract void save();
}
