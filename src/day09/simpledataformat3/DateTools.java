package day09.simpledataformat3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author XieKong
 * @date 2019/6/18 14:43
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> t = new ThreadLocal<>();

    public static SimpleDateFormat getSimpleDateFormat(String formatPattern) throws ParseException {
        SimpleDateFormat dateFormat = t.get();
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat(formatPattern);
        }
        return dateFormat;
    }
}
