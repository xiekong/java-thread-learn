package day05.lockin;

/**
 * @author XieKong
 * @date 2019/6/11 13:50
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        MyObject object = new MyObject();
        object.methodA();
    }
}
