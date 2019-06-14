package day02.currentthreadext;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t = new Thread(c);
        t.setName("A");
        t.start();
    }
}
