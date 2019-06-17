package day08.waitnotify;

/**
 * @author XieKong
 * @date 2019/6/17 10:27
 */
public class ThreadB extends Thread {
    private Object lock;
    private MyList myList;

    public ThreadB(Object lock, MyList myList) {
        this.lock = lock;
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (myList.size() != 5) {
                    System.out.println("开始等待 " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("结束等待 " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
