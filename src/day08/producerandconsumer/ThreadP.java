package day08.producerandconsumer;

/**
 * @author XieKong
 * @date 2019/6/17 11:23
 */
public class ThreadP extends Thread {
    private Producer producer;

    public ThreadP(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.setValue();
        }
    }
}
