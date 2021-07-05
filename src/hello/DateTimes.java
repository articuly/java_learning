package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimes {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String dateStr = df.format(now);
        System.out.println(dateStr);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
        String dateString = "20210121125931.123";
        try {
            Date date = sdf.parse(dateString);
            System.out.println(date.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
