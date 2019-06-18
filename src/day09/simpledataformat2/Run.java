package day09.simpledataformat2;

/**
 * @author XieKong
 * @date 2019/6/18 14:37
 */
public class Run {
    public static void main(String[] args) {
        String[] dataStrArray = new String[]{
                "2000-01-01",
                "2000-01-02",
                "2000-01-03",
                "2000-01-04",
                "2000-01-05",
                "2000-01-06",
                "2000-01-07",
                "2000-01-08",
                "2000-01-09",
                "2000-01-10",
                "2000-01-11",
                "2000-01-12"
        };

        Thread[] threads = new Thread[dataStrArray.length];
        for (int i = 0; i < dataStrArray.length; i++) {
            threads[i] = new MyThread(dataStrArray[i]);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
