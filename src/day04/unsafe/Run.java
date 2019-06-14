package day04.unsafe;

/**
 * @author XieKong
 * @date 2019/6/6 18:04
 * 全局变量非线程安全
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum selfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(selfPrivateNum);
        threadA.start();
        ThreadB threadB = new ThreadB(selfPrivateNum);
        threadB.start();
    }
}
