package Files;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\ASL\\avgmileage.csv");
        if (f.exists()) {
            long size = f.length();
            long lastModified = f.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeStr = sdf.format(new Date(lastModified));
            System.out.println("Size: " + size);
            System.out.println("Last Modified: " + timeStr);
        }
    }
}
