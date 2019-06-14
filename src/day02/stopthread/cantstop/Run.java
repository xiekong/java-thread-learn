package day02.stopthread.cantstop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 *
 * Java 中停止正在运行的线程有3中方法：
 * 1、使用退出标志，使线程正常退出，也就是当run方法完成后线程终止
 * 2、使用stop方法强行终止线程，不推荐。stop、suspend和resume都是作废方法，
 * 使用他们可能产生不可预料的结果
 * 3、使用interrupt终端线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();

            FileWriter writer = new FileWriter(new File("log.txt"));
            writer.write("是否停止1: " + myThread.interrupted() + "\n"); // false
            writer.write("是否停止2: " + myThread.interrupted() + "\n" ); // false
            writer.flush();
            writer.close();
        } catch (InterruptedException | IOException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
