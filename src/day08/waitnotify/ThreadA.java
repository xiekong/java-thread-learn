package day08.waitnotify;

/**
 * @author XieKong
 * @date 2019/6/17 10:27
 */
public class ThreadA extends Thread {
    private Object lock;
    private MyList myList;

    public ThreadA(Object lock, MyList myList) {
        this.lock = lock;
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    myList.add();
                    if (myList.size() == 5) {
                        lock.notify();
                        System.out.println("已经发出通知");
                    }
                    System.out.println("添加了" + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
