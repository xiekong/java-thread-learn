package day07.deadloop;

/**
 * @author XieKong
 * @date 2019/6/14 17:24
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            RunThread t = new RunThread();
            t.start();
            Thread.sleep(1000);
            t.setRun(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
