package day05.exceptionnolock;

/**
 * @author XieKong
 * @date 2019/6/11 13:50
 */
public class ThreadB extends Thread {
    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodA();
    }
}
