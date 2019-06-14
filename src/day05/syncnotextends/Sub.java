package day05.syncnotextends;

/**
 * @author XieKong
 * @date 2019/6/11 18:23
 */
public class Sub extends Main {
    /**
     * 不会继承同步，要使方法同步必须加synchronized声明
     */
    @Override
    public void method() {
        try {
            System.out.println("init sub next sleep begin thread name "
                    + Thread.currentThread().getName()
                    + " time " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("init sub next sleep end thread name "
                    + Thread.currentThread().getName()
                    + " time " + System.currentTimeMillis());
            super.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
