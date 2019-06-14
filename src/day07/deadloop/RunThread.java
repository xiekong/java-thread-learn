package day07.deadloop;

/**
 * @author XieKong
 * @date 2019/6/14 17:22
 */
public class RunThread extends Thread {
    private volatile boolean isRun = true;

    public void setRun(boolean run) {
        isRun = run;
    }

    @Override
    public void run() {
        System.out.println("进入Run方法");
        while (isRun) {
        }
        System.out.println("线程停止");
    }
}
