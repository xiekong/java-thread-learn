package day09.fair;

/**
 * @author XieKong
 * @date 2019/6/18 9:37
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread name " + Thread.currentThread().getName() + " run");
                service.testMethod();
            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
//            threads[i].setName("thread-" + i);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
