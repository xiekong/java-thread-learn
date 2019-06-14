package day06.sync;

/**
 * @author XieKong
 * @date 2019/6/13 15:40
 *
 * 使用 synchronized 修饰方法，多线程执行的时候会耗时很长
 */
public class Task {
    private String data1;
    private String data2;

//    public synchronized void doLongTimeTask() {
//        try {
//            System.out.println("begin task");
//            Thread.sleep(3000);
//            data1 = "长时间处理任务后从远程返回的值 1 thread name " + Thread.currentThread().getName();
//            data2 = "长时间处理任务后从远程返回的值 2 thread name " + Thread.currentThread().getName();
//            System.out.println(data1);
//            System.out.println(data2);
//            System.out.println("end task");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public void doLongTimeTask() {
        try {
            System.out.println("begin task " + Thread.currentThread().getName() + " time " + System.currentTimeMillis());
            Thread.sleep(3000);
//            String dataStr1 = "长时间处理任务后从远程返回的值 1 thread name " + Thread.currentThread().getName();
//            String dataStr2 = "长时间处理任务后从远程返回的值 2 thread name " + Thread.currentThread().getName();
            synchronized (this) {
                data1 = "长时间处理任务后从远程返回的值 1 thread name " + Thread.currentThread().getName();
                data2 = "长时间处理任务后从远程返回的值 2 thread name " + Thread.currentThread().getName();
//                data1 = dataStr1;
//                data2 = dataStr2;
//                System.out.println("synchronized  -->" + data1);
//                System.out.println("synchronized  -->" + data2);
            }
            System.out.println(data1);
            System.out.println(data2);
            System.out.println("end task " + Thread.currentThread().getName() + " time " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void getValue() {
//        synchronized (this) {
//            System.out.println(data1);
//            System.out.println(data2);
//        }
//    }
}
