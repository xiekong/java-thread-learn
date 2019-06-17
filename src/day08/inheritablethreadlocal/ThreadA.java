package day08.inheritablethreadlocal;

/**
 * @author XieKong
 * @date 2019/6/17 14:33
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA中取值: " + Tools.threadLocalValue.get());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
