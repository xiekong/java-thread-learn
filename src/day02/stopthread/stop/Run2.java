package day02.stopthread.stop;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 *
 * Java 中停止正在运行的线程有3中方法：
 * 1、使用退出标志，使线程正常退出，也就是当run方法完成后线程终止
 * 2、使用stop方法强行终止线程，不推荐。stop、suspend和resume都是作废方法，
 * 使用他们可能产生不可预料的结果
 * 3、使用interrupt终端线程
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            MyThread2 myThread = new MyThread2();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
