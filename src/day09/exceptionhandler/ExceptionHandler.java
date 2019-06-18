package day09.exceptionhandler;

/**
 * @author XieKong
 * @date 2019/6/18 14:57
 */
public class ExceptionHandler {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("t1");
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("thread name " + t.getName() + " exception: ");
                e.printStackTrace();
            }
        });
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("t2");
        t2.start();
    }
}
