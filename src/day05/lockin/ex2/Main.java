package day05.lockin.ex2;

/**
 * @author XieKong
 * @date 2019/6/11 17:57
 */
public class Main {
    public int num = 10;

    synchronized public void operateMainMethod() {
        num--;
        System.out.println("main num=" + num);
    }
}
