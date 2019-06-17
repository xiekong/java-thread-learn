package day08.waitreleaselock;

/**
 * @author XieKong
 * @date 2019/6/17 11:06
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
