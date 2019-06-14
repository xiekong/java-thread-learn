package day02.stopthread.cantstop;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 *
 * 测试当前线程是否已经中断。线程的中断状态由该方法淸除。换句话说,如果连续两次
 * 调用该方法,则第二次调用将返回 false(在第一次调用已清除了其中断状态之后,且第
 * 二次调用检验完中断状态前,当前线程再次中断的情况除外)
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1: " + Thread.interrupted());
        System.out.println("是否停止2: " + Thread.interrupted());
        System.out.println("end");
    }
}
