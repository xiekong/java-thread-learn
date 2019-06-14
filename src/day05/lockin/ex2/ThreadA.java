package day05.lockin.ex2;

/**
 * @author XieKong
 * @date 2019/6/11 13:50
 */
public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.operateSubMethod();
    }
}
