package day05.lockobject2;

/**
 * @author XieKong
 * @date 2019/6/11 13:52
 *
 * A线程先持有MyObject对象的Lock锁，B线程可以异步调用MyObject对象的非synchronized类型方法。
 * A线程先持有MyObject对象的Lock锁，B线程如果在这时调用MyObject对象的synchronized类型方法则需等待，也就是同步。
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(myObject);
        a.setName("A");
        ThreadB b = new ThreadB(myObject);
        b.setName("B");

        a.start();
        b.start();
    }
}
