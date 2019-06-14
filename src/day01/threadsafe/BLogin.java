package day01.threadsafe;

/**
 * @author XieKong
 * @date 2019/6/3 19:02
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
