package day09.singleton1;

/**
 * @author XieKong
 * @date 2019/6/18 11:14
 */
public class MyObject {
    // 立即加载，饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    public static MyObject getInstance() {
        /**
         * 此代码为立即加载，不能有其他实例变量。
         * 因为getInstance()方法没有同步，所以
         * 有可能出现非线程安全问题
         */
        return myObject;
    }
}
