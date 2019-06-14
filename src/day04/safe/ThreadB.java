package day04.safe;

/**
 * @author XieKong
 * @date 2019/6/6 18:02
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum selfPrivateNum;

    public ThreadB(HasSelfPrivateNum selfPrivateNum) {
        super();
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        selfPrivateNum.addI("b");
    }
}
