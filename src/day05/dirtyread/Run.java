package day05.dirtyread;

/**
 * @author XieKong
 * @date 2019/6/11 17:38
 */
public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
//            publicVar.getValue();
            ThreadA a = new ThreadA(publicVar);
            a.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
