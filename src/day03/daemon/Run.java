package day03.daemon;

/**
 * @author XieKong
 * @date 2019/6/5 10:27
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.setDaemon(true);
            t.start();
            Thread.sleep(5000);
            System.out.println("不在打印了，也就是停止了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
