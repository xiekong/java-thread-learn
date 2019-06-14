package day07.volatiletest;

/**
 * @author XieKong
 * @date 2019/6/14 17:44
 */
public class MyThread extends Thread {
    public static int count = 0;

    private synchronized static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
