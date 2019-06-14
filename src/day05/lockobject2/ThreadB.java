package day05.lockobject2;

/**
 * @author XieKong
 * @date 2019/6/11 13:50
 */
public class ThreadB extends Thread {
    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
