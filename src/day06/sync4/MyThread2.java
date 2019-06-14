package day06.sync4;

/**
 * @author XieKong
 * @date 2019/6/13 17:44
 */
public class MyThread2 extends Thread {
    private MyOneList list;

    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.addMethod(list, "B");
    }
}
