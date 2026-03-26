package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimes {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String dateStr = df.format(now);
        System.out.println(dateStr);


        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = "20160824122159";
        if (dateString == null) {
            System.out.println("null pointer");
        }
        try {
            Date date1 = sdf1.parse(dateString);
            System.out.println(date1.toString());
        } catch (Exception e1) {
            try {
                Date date2 = sdf2.parse(dateString);
                System.out.println(date2.toString());
            } catch (Exception e2) {
                //System.out.println(e2.getMessage());
                //e2.printStackTrace();
            }
            //System.out.println(e1.getMessage());
            //e1.printStackTrace();
        }
    }
}
