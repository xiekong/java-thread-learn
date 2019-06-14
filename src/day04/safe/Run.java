package day04.safe;

/**
 * @author XieKong
 * @date 2019/6/6 18:04
 * 方法内的局部变量为线程安全
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
