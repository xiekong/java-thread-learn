package day06.sync;

/**
 * @author XieKong
 * @date 2019/6/13 15:46
 */
public class ThreadA extends Thread {
    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        Utils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        Utils.endTime1 = System.currentTimeMillis();
    }
}
