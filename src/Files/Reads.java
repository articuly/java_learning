package Files;

import java.io.File;
import java.io.FileInputStream;

public class Reads {
    public static void main(String[] args) {
        File dir = new File("d:/tmp");
        dir.mkdirs();
        File file = new File(dir, "sample.txt");
        byte[] data = new byte[1024];

        try {
            FileInputStream in = new FileInputStream(file);
            int n = in.read(data);
            in.close();
            System.out.println("读出 " + n + " 字节");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
