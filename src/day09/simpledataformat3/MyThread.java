package day09.simpledataformat3;

import java.util.Date;

/**
 * @author XieKong
 * @date 2019/6/18 14:33
 */
public class MyThread extends Thread {
    private String dataStr;

    public MyThread(String dataStr) {
        this.dataStr = dataStr;
    }

    @Override
    public void run() {
        try {
            Date date = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(dataStr);
            String dataString = DateTools.getSimpleDateFormat("yyyy-MM-dd").format(date);
            if (!dataString.equals(dataStr)) {
                System.out.println("报错了, 日期字符串 " + dataStr + " 转换为 " + dataString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
