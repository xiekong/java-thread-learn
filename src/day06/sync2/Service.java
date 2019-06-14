package day06.sync2;

/**
 * @author XieKong
 * @date 2019/6/13 17:11
 */
public class Service {
    private String username;
    private String password;
//    private String anyString = new String();

    public void set(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("thread name " + Thread.currentThread().getName()
                        + " time " + System.currentTimeMillis() + " into sync block");
                this.username = username;
                Thread.sleep(3000);
                this.password = password;
                System.out.println("username " + this.username + " password " + this.password);
                System.out.println("thread name " + Thread.currentThread().getName()
                        + " time " + System.currentTimeMillis() + " leave sync block");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
