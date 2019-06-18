package day09.exceptionmove;

/**
 * @author XieKong
 * @date 2019/6/18 15:10
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e); // 注释此句不会打印 静态的异常处理
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
