package day09.groupexception;

/**
 * @author XieKong
 * @date 2019/6/18 15:06
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        MyThread[] threads = new MyThread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new MyThread(group, "线程-" + i, "1");
            threads[i].start();
        }

        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }
}
