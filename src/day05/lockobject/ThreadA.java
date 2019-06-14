package day05.lockobject;

/**
 * @author XieKong
 * @date 2019/6/11 13:50
 */
public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
