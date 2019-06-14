package day05.lockobject;

/**
 * @author XieKong
 * @date 2019/6/11 13:52
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(myObject);
        a.setName("A");
        ThreadB b = new ThreadB(myObject);
        b.setName("B");

        a.start();
        b.start();
    }
}
