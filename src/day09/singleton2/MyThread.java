package day09.singleton2;

/**
 * @author XieKong
 * @date 2019/6/18 11:18
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
