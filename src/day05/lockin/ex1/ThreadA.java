package day05.lockin.ex1;

/**
 * @author XieKong
 * @date 2019/6/11 13:50
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateSubMethod();
    }
}
