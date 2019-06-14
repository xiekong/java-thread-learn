package day07.atomic;

/**
 * @author XieKong
 * @date 2019/6/14 17:46
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        for (int i = 0; i < 100; i++) {
            new Thread(thread).start();
        }
    }
}
