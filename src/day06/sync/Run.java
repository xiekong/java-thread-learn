package day06.sync;

/**
 * @author XieKong
 * @date 2019/6/13 16:29
 * 使用 synchronized 修饰方法，多线程执行的时候会耗时很长
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(task);
        threadB.setName("B");
        threadB.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = Utils.beginTime1;

        if (Utils.beginTime2 < Utils.beginTime1) {
            beginTime = Utils.beginTime2;
        }

        long endTime = Utils.endTime1;

        if (Utils.endTime2 > Utils.endTime1) {
            endTime = Utils.endTime2;
        }

        System.out.println("耗时 " + ((endTime - beginTime) / 1000));
    }
}
