package hello;

import java.util.Calendar;

public class FatherDay {
    public static void main(String[] args) {
        // 创建对象
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JUNE, 1);
        int numWeek = 0;

        for (int i = 0; i < 31; i++) {
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            // 星期天是数字1
            if (dayOfWeek == Calendar.SUNDAY) {
                numWeek++;
                if (numWeek == 3) {
                    System.out.printf("2021年父亲节：2021-6-%d\n", i + 1);
                    break;
                }
            }
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
