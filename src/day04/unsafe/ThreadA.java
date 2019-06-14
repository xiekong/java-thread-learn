package day04.unsafe;

/**
 * @author XieKong
 * @date 2019/6/6 18:02
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum selfPrivateNum;

    public ThreadA(HasSelfPrivateNum selfPrivateNum) {
        super();
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        selfPrivateNum.addI("a");
    }
}
