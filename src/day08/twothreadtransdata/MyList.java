package day08.twothreadtransdata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XieKong
 * @date 2019/6/17 10:25
 */
public class MyList {
    private List list = new ArrayList();

    public void add() {
        list.add("xiekong");
    }

    public int size() {
        return list.size();
    }
}
