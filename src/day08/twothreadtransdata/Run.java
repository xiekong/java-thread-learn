package day08.twothreadtransdata;

/**
 * @author XieKong
 * @date 2019/6/17 10:31
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA a = new ThreadA(myList);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(myList);
        b.setName("B");
        b.start();
    }
}
