package day07.onelock;

/**
 * @author XieKong
 * @date 2019/6/14 11:09
 */
public class Account2 {
    private Object lock;
    String name;
    private int balance = 200;

    public Account2(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }

    void transfer(Account2 target, int amt) {
//        synchronized (lock) {
            if (this.balance >= amt) {
                this.balance -= amt;
                target.balance += amt;
            }
//        }
    }

    public int getBalance() {
//        synchronized (lock) {
            return balance;
//        }
    }
}
