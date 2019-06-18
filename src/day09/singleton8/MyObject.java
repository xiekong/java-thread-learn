package day09.singleton8;

/**
 * @author XieKong
 * @date 2019/6/18 11:14
 */
public class MyObject {
    private static MyObject instance = null;

    private MyObject() {
    }

    // 使用静态代码块
    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
