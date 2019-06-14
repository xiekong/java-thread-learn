package day03.returninterrupt;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }
            System.out.println(System.currentTimeMillis());
        }
    }
}
