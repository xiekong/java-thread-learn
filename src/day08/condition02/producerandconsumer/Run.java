package day08.condition02.producerandconsumer;

/**
 * @author XieKong
 * @date 2019/6/17 11:24
 */
public class Run {
    public static void main(String[] args) {
        ValueObject object = new ValueObject();

        ThreadP p1 = new ThreadP(object);
        p1.setName("producer");
        ThreadC c1 = new ThreadC(object);
        c1.setName("consumer");

        p1.start();
        c1.start();
    }
}
