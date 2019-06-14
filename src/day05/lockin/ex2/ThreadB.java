package day05.lockin.ex2;

/**
 * @author XieKong
 * @date 2019/6/11 13:50
 */
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.operateSubMethod();
    }
}
