package day09.exceptionhandler;

/**
 * @author XieKong
 * @date 2019/6/18 15:00
 */
public class DefaultExceptionHandler {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("thread name " + t.getName() + " exception: ");
                e.printStackTrace();
            }
        });

        MyThread t1 = new MyThread();
        t1.setName("t1");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("t2");
        t2.start();
    }
}
