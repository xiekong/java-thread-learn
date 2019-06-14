package day05.lockin;

/**
 * @author XieKong
 * @date 2019/6/11 13:47
 */
public class MyObject {
    synchronized public void methodA() {
        System.out.println("methodA");
        methodB();
    }

    synchronized public void methodB() {
        System.out.println("methodB");
        methodC();
    }

    synchronized public void methodC() {
        System.out.println("methodC");
    }
}
