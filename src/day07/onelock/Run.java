package day07.onelock;

/**
 * @author XieKong
 * @date 2019/6/14 11:12
 */
public class Run {
    public static void main(String[] args) {
        Account a = new Account("a");
        Account b = new Account("b");
        Account c = new Account("c");

        TransferThread run1 = new TransferThread(a, b);
        TransferThread run2 = new TransferThread(b, c);
        Thread t1 = new Thread(run1);
        t1.setName("t1");
        t1.start();
        Thread t2 = new Thread(run2);
        t2.setName("t2");
        t2.start();
    }
}
