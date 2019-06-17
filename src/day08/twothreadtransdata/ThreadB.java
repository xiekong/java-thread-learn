package day08.twothreadtransdata;

/**
 * @author XieKong
 * @date 2019/6/17 10:27
 */
public class ThreadB extends Thread {
    private volatile MyList myList;

    public ThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (myList.size() == 5) {
                    System.out.println("==5了, 线程B要退出了");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
