package day06.sync4;

/**
 * @author XieKong
 * @date 2019/6/13 17:41
 */
public class MyService {
    public MyOneList addMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);// 模拟远程获取数据
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
