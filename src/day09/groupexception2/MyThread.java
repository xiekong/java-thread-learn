package day09.groupexception2;

/**
 * @author XieKong
 * @date 2019/6/18 15:03
 */
public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (!this.isInterrupted()) {
            System.out.println("死循环中 " + Thread.currentThread().getName());
        }
    }
}
