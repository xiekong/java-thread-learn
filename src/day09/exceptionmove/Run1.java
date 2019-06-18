package day09.exceptionmove;

/**
 * @author XieKong
 * @date 2019/6/18 15:21
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // 对象
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        // 类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
