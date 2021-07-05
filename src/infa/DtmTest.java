package infa;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DtmTest {
    public String DtmConvert(String sDtm) {
        SimpleDateFormat sFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
        SimpleDateFormat tFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String invalidDate = "invalid datetime";
        if (sDtm == null) {
            return null;
        } else {
            try {
                Date dtm = sFormat.parse(sDtm);
//            System.out.println(dtm.toString());
                String dateStr = tFormat.format(dtm);
                return dateStr;
            } catch (Exception e) {
                System.out.println(e.getMessage());
//            e.printStackTrace();
                return invalidDate;
            }
        }
    }

    @Test
    public void testDtmConvert() {
//        String sDtm = "20201203125931.123";
        String sDtm = null;
        String tDtm = DtmConvert(sDtm);
        System.out.println(tDtm);
    }
}


