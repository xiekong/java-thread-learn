package day01.threadsafe;

/**
 * @author XieKong
 * @date 2019/6/3 18:56
 * 模拟一个 Servlet 组件
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    /**
     * 非线程安全
     * @param username
     * @param password
     */
//    public static void doPost(String username, String password) {
//        try {
//            usernameRef = username;
//            if (username.equals("a")) {
//                Thread.sleep(5000);
//            }
//            passwordRef = password;
//            System.out.println("username=" + usernameRef + ", password=" + password);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 线程安全
     * @param username
     * @param password
     */
    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + ", password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
