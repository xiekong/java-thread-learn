package day05.syncnotextends;


/**
 * @author XieKong
 * @date 2019/6/11 13:52
 *
 * 同步不具有继承性
 */
public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        ThreadA a = new ThreadA(sub);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(sub);
        b.setName("b");
        b.start();
    }
}
