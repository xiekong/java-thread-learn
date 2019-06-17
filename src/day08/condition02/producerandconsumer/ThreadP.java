package day08.condition02.producerandconsumer;

/**
 * @author XieKong
 * @date 2019/6/17 11:23
 */
public class ThreadP extends Thread {
    private ValueObject valueObject;

    public ThreadP(ValueObject valueObject) {
        this.valueObject = valueObject;
    }

    @Override
    public void run() {
        while (true) {
            valueObject.setValue();
        }
    }
}
