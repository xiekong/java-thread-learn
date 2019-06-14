package day06.sync;

/**
 * @author XieKong
 * @date 2019/6/13 15:46
 */
public class ThreadB extends Thread {
    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        Utils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        Utils.endTime2 = System.currentTimeMillis();
    }
}
