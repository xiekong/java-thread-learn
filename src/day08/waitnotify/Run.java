package day08.waitnotify;

/**
 * @author XieKong
 * @date 2019/6/17 10:31
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyList myList = new MyList();
        ThreadA a = new ThreadA(lock, myList);
        a.setName("A");

        ThreadB b = new ThreadB(lock, myList);
        b.setName("B");
        b.start();

        a.start();
    }
}
