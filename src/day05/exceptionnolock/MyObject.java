package day05.exceptionnolock;

/**
 * @author XieKong
 * @date 2019/6/11 13:47
 */
public class MyObject {
    synchronized public void methodA() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("thread name " + Thread.currentThread().getName()
                    + " run begin time " + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("thread name " + Thread.currentThread().getName()
                            + " run exception time " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("thread b run exception time " + System.currentTimeMillis());
        }
    }
}
