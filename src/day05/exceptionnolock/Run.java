package day05.exceptionnolock;


/**
 * @author XieKong
 * @date 2019/6/11 13:52
 * 当一个线程执行代码出现异常时，其持有的锁会自动释放
 */
public class Run {
    public static void main(String[] args) {
        // a 线程出现异常，b线程正常执行方法
        try {
            MyObject myObject = new MyObject();

            ThreadA a = new ThreadA(myObject);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            ThreadB b = new ThreadB(myObject);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
