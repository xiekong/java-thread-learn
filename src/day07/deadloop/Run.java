package day07.deadloop;

/**
 * @author XieKong
 * @date 2019/6/14 17:11
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
//        PrintString printString = new PrintString();
        PrintString2 printString = new PrintString2();
        Thread t = new Thread(printString);
        t.start();
//        t.join();
        Thread.sleep(3000);
        System.out.println("stop thread name " + Thread.currentThread().getName());
        printString.setPrinted(false);
    }
}
