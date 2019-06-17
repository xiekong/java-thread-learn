package day08.threadlocal;

/**
 * @author XieKong
 * @date 2019/6/17 14:15
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.threadLocalValue.set("Main " + i);
                System.out.println("Main get " + Tools.threadLocalValue.get());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
