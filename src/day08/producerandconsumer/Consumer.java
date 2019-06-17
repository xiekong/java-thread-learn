package day08.producerandconsumer;

/**
 * @author XieKong
 * @date 2019/6/17 11:21
 */
public class Consumer {
    private Object lock;
    private ValueObject valueObject;

    public Consumer(Object lock, ValueObject valueObject) {
        this.lock = lock;
        this.valueObject = valueObject;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (valueObject.getValue().equals("")) {
                    lock.wait();
                }
                System.out.println("get value=" + valueObject.getValue());
                valueObject.setValue("");
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
