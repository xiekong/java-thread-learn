package day08.producerandcostomer;

/**
 * @author XieKong
 * @date 2019/6/17 11:15
 */
public class Producer {
    private Object lock;
    private ValueObject valueObject;

    public Producer(Object lock, ValueObject valueObject) {
        this.lock = lock;
        this.valueObject = valueObject;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!valueObject.getValue().equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value=" + value);
                valueObject.setValue(value);
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
