package day09.exceptionhandler;

/**
 * @author XieKong
 * @date 2019/6/18 14:55
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
