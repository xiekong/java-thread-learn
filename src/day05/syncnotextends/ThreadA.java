package day05.syncnotextends;

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
        sub.method();
    }
}
