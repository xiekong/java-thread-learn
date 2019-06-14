package day07.deadloop;

/**
 * @author XieKong
 * @date 2019/6/14 17:08
 */
public class PrintString {
    private boolean printed = true;

    public boolean isPrinted() {
        return printed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }

    public void print() {
        try {
            while (printed) {
                System.out.println("run print method thread name " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
