package day08.producerandconsumer;

/**
 * @author XieKong
 * @date 2019/6/17 11:24
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ValueObject object = new ValueObject();
        Producer producer = new Producer(lock, object);
        Consumer consumer = new Consumer(lock, object);

        ThreadP p1 = new ThreadP(producer);
        ThreadC c1 = new ThreadC(consumer);

        p1.start();
        c1.start();
    }
}
