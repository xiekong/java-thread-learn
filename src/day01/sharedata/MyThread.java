package day01.sharedata;

/**
 * @author XieKong
 * @date 2019/6/3 18:19
 */
public class MyThread extends Thread {
    private int count = 5;

    /**
     * 非线程安全
     */
//    @Override
//    public void run() {
//        super.run();
//        count--;
//        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
//    }

    /**
     * 线程安全
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
    }
}
