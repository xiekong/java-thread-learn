package day06.sync3;


/**
 * @author XieKong
 * @date 2019/6/13 16:29
 * 使用 synchronized(非 this)
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
