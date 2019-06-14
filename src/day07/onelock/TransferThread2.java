package day07.onelock;

/**
 * @author XieKong
 * @date 2019/6/14 11:11
 */
public class TransferThread2 implements Runnable {
    private Account2 account;
    private Account2 target;

    public TransferThread2(Account2 account, Account2 target) {
        this.account = account;
        this.target = target;
    }

    @Override
    public void run() {
        this.account.transfer(this.target, 150);
    }
}
