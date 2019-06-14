package day07.onelock;

/**
 * @author XieKong
 * @date 2019/6/14 11:11
 */
public class TransferThread implements Runnable {
    private Account account;
    private Account target;

    public TransferThread(Account account, Account target) {
        this.account = account;
        this.target = target;
    }

    @Override
    public void run() {
        this.account.transfer(this.target, 100);
        System.out.println("thread name " + Thread.currentThread().getName() + " account " + this.account.name + " balance " + this.account.getBalance());
        System.out.println("thread name " + Thread.currentThread().getName() + " target " + this.target.name + " balance " + this.target.getBalance());
    }
}
