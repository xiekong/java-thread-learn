package day02.currentthreadext;

/**
 * @author XieKong
 * @date 2019/6/4 16:24
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate Constructor begin");
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("this.getName(): " + this.getName());
        System.out.println("CountOperate Constructor end");
    }

    @Override
    public void run() {
        System.out.println("run method begin");
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("this.getName(): " + this.getName());
        System.out.println("run method end");
    }
}
