package day02.stopthread.cantstop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 *
 * 1) this.interrupted():测试当前线程是否已经是中断状态,
 * 执行后具有将状态标志置清除为 false 的功能。
 * 2) this.isInterrupted():测试线程 Thread 对象是否已经
 * 是中断状态,但不清除状态标志。
 */
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();

            FileWriter writer = new FileWriter(new File("log.txt"));
            writer.write("是否停止1: " + myThread.isInterrupted() + "\n"); // true
            writer.write("是否停止2: " + myThread.isInterrupted() + "\n" ); // true
            writer.flush();
            writer.close();
        } catch (InterruptedException | IOException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
