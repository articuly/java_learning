package Files;

import java.io.File;
import java.io.FileInputStream;

public class ReadText {
    public static void main(String[] args) {
        File dir = new File("d:/tmp");
        dir.mkdirs();
        File f = new File(dir, "abc.txt");
        byte[] data = new byte[1024];
        try {
            FileInputStream input = new FileInputStream(f);
            int n = input.read(data);
            input.close();

            String text = new String(data, 0, n, "UTF-8");
            System.out.println("读出 " + n + " 字节");
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
