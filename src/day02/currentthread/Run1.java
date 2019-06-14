package day02.currentthread;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 * currentThread() 返回代码段正被哪个线程调用的信息
 */
public class Run1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
