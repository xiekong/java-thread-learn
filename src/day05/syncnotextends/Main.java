package day05.syncnotextends;

/**
 * @author XieKong
 * @date 2019/6/11 18:20
 */
public class Main {
    public synchronized void method() {
        try {
            System.out.println("init main next sleep begin thread name "
                    + Thread.currentThread().getName()
                    + " time " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("init main next sleep end thread name "
                    + Thread.currentThread().getName()
                    + " time " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
