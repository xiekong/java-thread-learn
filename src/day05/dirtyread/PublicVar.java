package day05.dirtyread;

/**
 * @author XieKong
 * @date 2019/6/11 17:31
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue -> 线程 " + Thread.currentThread().getName() + " username=" + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void getValue() {
        System.out.println("getValue -> 线程 " + Thread.currentThread().getName() + " username=" + username + " password=" + password);
    }
}
