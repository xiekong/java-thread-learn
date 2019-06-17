package day08.producerandcostomer;

/**
 * @author XieKong
 * @date 2019/6/17 11:24
 */
public class ThreadC extends Thread {
    private Costomer costomer;

    public ThreadC(Costomer costomer) {
        this.costomer = costomer;
    }

    @Override
    public void run() {
        while (true) {
            costomer.getValue();
        }
    }
}
