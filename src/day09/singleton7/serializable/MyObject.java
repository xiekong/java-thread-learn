package day09.singleton7.serializable;

import java.io.Serializable;

/**
 * @author XieKong
 * @date 2019/6/18 11:14
 */
public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

    private static class MyObjectHandler {
        private static final MyObject myObject = new MyObject();
    }

    private MyObject() {
    }


    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() {
        System.out.println("readResolve");
        return MyObjectHandler.myObject;
    }
}
