package day08.inheritablethreadlocal;

/**
 * @author XieKong
 * @date 2019/6/17 14:36
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main中取值: " + Tools.threadLocalValue.get());
                Thread.sleep(1000);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
