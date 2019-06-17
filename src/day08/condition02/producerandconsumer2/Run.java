package day08.condition02.producerandconsumer2;

/**
 * @author XieKong
 * @date 2019/6/17 11:24
 */
public class Run {
    public static void main(String[] args) {
        ValueObject object = new ValueObject();

        ThreadP[] p = new ThreadP[10];
        ThreadC[] c = new ThreadC[10];

        for (int i = 0; i < 10; i++) {
            p[i] = new ThreadP(object);
            c[i] = new ThreadC(object);

            p[i].setName("producer" + i);
            p[i].start();
            c[i].setName("consumer" + i);
            c[i].start();
        }
    }
}
