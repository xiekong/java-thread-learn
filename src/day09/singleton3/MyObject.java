package day09.singleton3;

/**
 * @author XieKong
 * @date 2019/6/18 11:14
 */
public class MyObject {
    // 延时加载，懒汉模式
    private static MyObject myObject;

    private MyObject() {
    }

    // 线程安全，但是效率低下
    public synchronized static MyObject getInstance() {
        try {
            if (myObject == null) {
                // 模拟在创建对象前做一些准备工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
