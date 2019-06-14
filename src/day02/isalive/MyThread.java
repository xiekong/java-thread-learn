package day02.isalive;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread extends Thread {
    @Override
    synchronized public void run() {
        System.out.println("run isAlive: " + this.isAlive());
    }
}
