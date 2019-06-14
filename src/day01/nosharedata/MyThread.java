package day01.nosharedata;

/**
 * @author XieKong
 * @date 2019/6/3 18:19
 */
public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        }
    }
}
