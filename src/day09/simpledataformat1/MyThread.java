package day09.simpledataformat1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XieKong
 * @date 2019/6/18 14:33
 */
public class MyThread extends Thread {
    private SimpleDateFormat dateFormat;
    private String dataStr;

    public MyThread(SimpleDateFormat dateFormat, String dataStr) {
        this.dateFormat = dateFormat;
        this.dataStr = dataStr;
    }

    @Override
    public void run() {
        try {
            Date date = dateFormat.parse(dataStr);
            String dataString = dateFormat.format(date);
            if (!dataString.equals(dataStr)) {
                System.out.println("报错了, 日期字符串 " + dataStr + " 转换为 " + dataString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
