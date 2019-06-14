package day07.onelock;

/**
 * @author XieKong
 * @date 2019/6/14 11:12
 */
public class Run2 {
    public static void main(String[] args) {
        Object lock = new Object();
        Account2 a = new Account2("a", lock);
        Account2 b = new Account2("b", lock);
        Account2 c = new Account2("c", lock);

        TransferThread2 run1 = new TransferThread2(a, b);
        TransferThread2 run2 = new TransferThread2(a, c);
//        TransferThread2 run3 = new TransferThread2(a, b);
        Thread t1 = new Thread(run1);
//        t1.setName("t1");
        t1.start();
        Thread t2 = new Thread(run2);
//        t2.setName("t2");
        t2.start();
//        Thread t3 = new Thread(run3);
//        t3.setName("t3");
//        t3.start();


        try {
            Thread.sleep(1000);
            System.out.println("name " + a.name + " balance " + a.getBalance());
            System.out.println("name " + b.name + " balance " + b.getBalance());
            System.out.println("name " + c.name + " balance " + c.getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
