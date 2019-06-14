package day07.onelock;

/**
 * @author XieKong
 * @date 2019/6/14 11:09
 */
public class Account {
    String name;
    private int balance = 200;

    public Account(String name) {
        this.name = name;
    }

    synchronized void transfer(Account target, int amt) {
        if (this.balance > amt) {
            this.balance -= amt;
            target.balance += amt;
        }
    }

    public int getBalance() {
        return balance;
    }
}
