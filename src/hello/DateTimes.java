package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimes {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String dateStr = df.format(now);
        System.out.println(dateStr);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2021-1-21";
        try {
            Date date = sdf.parse(dateString);
            System.out.println(date.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
