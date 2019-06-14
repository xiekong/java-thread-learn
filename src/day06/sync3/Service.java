package day06.sync3;

/**
 * @author XieKong
 * @date 2019/6/13 17:11
 */
public class Service {
    private String anyString = new String();

    public void a() {
        try {
//            String anyString = new String();
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void b() {
//        try {
//            String anyString = new String();
//            synchronized (anyString) {
                System.out.println("b begin");
//                Thread.sleep(3000);
                System.out.println("b end");
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
