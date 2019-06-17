package day08.producerandcostomer;

/**
 * @author XieKong
 * @date 2019/6/17 11:24
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ValueObject object = new ValueObject();
        Producer producer = new Producer(lock, object);
        Costomer costomer = new Costomer(lock, object);

        ThreadP p1 = new ThreadP(producer);
        ThreadC c1 = new ThreadC(costomer);

        p1.start();
        c1.start();
    }
}
