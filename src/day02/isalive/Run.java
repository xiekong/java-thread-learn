package day02.isalive;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 * isAlive() 判断当前线程是否处于活动状态
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("before start myThread isAlive: " + myThread.isAlive());
        myThread.start();
        System.out.println("after start myThread isAlive: " + myThread.isAlive());
    }
}
