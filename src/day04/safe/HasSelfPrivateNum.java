package day04.safe;

/**
 * @author XieKong
 * @date 2019/6/6 17:23
 */
public class HasSelfPrivateNum {
    public void addI(String name) {
        try {
            // 方法内的局部变量为线程安全
            int num = 0;
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
