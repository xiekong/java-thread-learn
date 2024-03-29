package day06.sync4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XieKong
 * @date 2019/6/13 17:39
 */
public class MyOneList {
    private List list = new ArrayList<>();

    public synchronized void add(String data) {
        list.add(data);
    }

    public synchronized int getSize() {
        return list.size();
    }
}
