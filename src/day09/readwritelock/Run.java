package day09.readwritelock;

/**
 * @author XieKong
 * @date 2019/6/18 10:06
 *
 * 读锁共享，写锁互斥
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
