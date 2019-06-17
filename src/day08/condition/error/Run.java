package day08.condition.error;

/**
 * @author XieKong
 * @date 2019/6/17 17:36
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
