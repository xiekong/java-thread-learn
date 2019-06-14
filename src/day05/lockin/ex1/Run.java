package day05.lockin.ex1;


/**
 * @author XieKong
 * @date 2019/6/11 13:52
 *
 * 可重入锁的概念是:自己可以再次获取自己的内部锁。比如
 * 有1条线程获得了某个对象的锁,此时这个对象锁还没有释放,
 * 当其再次想要获取这个对象的锁的时候还是可以获取的,如
 * 果不可锁重入的话,就会造成死锁。
 * 可重入锁也支持在父子类继承的环境中。
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();
    }
}
