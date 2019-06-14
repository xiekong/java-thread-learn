package day07.volatiletest;

/**
 * @author XieKong
 * @date 2019/6/14 17:46
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] threads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            threads[i].start();

        }
    }
}
