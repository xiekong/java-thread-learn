package day09.singleton6;

/**
 * @author XieKong
 * @date 2019/6/18 11:14
 */
public class MyObject {
    // 使用DCL双检查锁机制，解决非线程安全问题
    private volatile static MyObject myObject;

    private MyObject() {
    }


    public static MyObject getInstance() {
        try {
            if (myObject == null) {
                // 模拟在创建对象前做一些准备工作
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
