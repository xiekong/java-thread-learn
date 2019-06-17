package day08.condition02.producerandconsumer2;

/**
 * @author XieKong
 * @date 2019/6/17 11:24
 */
public class ThreadC extends Thread {
    private ValueObject valueObject;

    public ThreadC(ValueObject valueObject) {
        this.valueObject = valueObject;
    }

    @Override
    public void run() {
        valueObject.getValue();
    }
}
