package day01.nosharedata;

/**
 * @author XieKong
 * @date 2019/6/3 18:39
 */
public class Main {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();
    }
}
