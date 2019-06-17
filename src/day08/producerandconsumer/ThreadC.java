package day08.producerandconsumer;

/**
 * @author XieKong
 * @date 2019/6/17 11:24
 */
public class ThreadC extends Thread {
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.getValue();
        }
    }
}
