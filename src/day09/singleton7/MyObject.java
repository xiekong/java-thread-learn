package day09.singleton7;

/**
 * @author XieKong
 * @date 2019/6/18 11:14
 */
public class MyObject {
    // 使用静态内部类，解决非线程安全问题
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }


    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}
