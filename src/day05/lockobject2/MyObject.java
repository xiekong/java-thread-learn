package day05.lockobject2;

/**
 * @author XieKong
 * @date 2019/6/11 13:47
 */
public class MyObject {
    /**
     * synchronized 声明的方法一定是排队执行的
     * 只有共享资源的读写才需要同步化
     */
    synchronized public void methodA() {
        try {
            System.out.println("methodA -> 线程名: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodA -> 结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void methodB() {
//        try {
//            System.out.println("methodB -> 线程名: " + Thread.currentThread().getName());
//            Thread.sleep(5000);
//            System.out.println("methodB -> 结束");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    synchronized public void methodB() {
        try {
            System.out.println("methodB -> 线程名: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodB -> 结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
