package Files;

import java.io.File;
import java.io.FileOutputStream;

public class Writes {
    public static void main(String[] args) {
        File dir = new File("d:/tmp");
        dir.mkdirs();
        File file = new File(dir, "sample.txt");
        byte[] data = {1, 2, 3, 4};
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write(data, 0, 4);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
