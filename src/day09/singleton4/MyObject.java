package day09.singleton4;

/**
 * @author XieKong
 * @date 2019/6/18 11:14
 */
public class MyObject {
    // 延时加载，懒汉模式
    private static MyObject myObject;

    private MyObject() {
    }


    public static MyObject getInstance() {
        try {
            /**
             * 此种写法等同public synchronized static MyObject getInstance，效率低下
             */
            synchronized (MyObject.class) {
                if (myObject == null) {
                    // 模拟在创建对象前做一些准备工作
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
