package day09.simpledataformat2;

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
            Date date = DateTools.parse("yyyy-MM-dd", dataStr);
            String dataString = DateTools.format("yyyy-MM-dd", date);
            if (!dataString.equals(dataStr)) {
                System.out.println("报错了, 日期字符串 " + dataStr + " 转换为 " + dataString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
