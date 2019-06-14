package day04.unsafe;

/**
 * @author XieKong
 * @date 2019/6/6 17:23
 */
public class HasSelfPrivateNum {
    // 全局变量非线程安全
    private int num = 0;
    public void addI(String name) {
        try {
            if (name.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(name + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
