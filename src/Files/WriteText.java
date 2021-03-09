package Files;

import java.io.File;
import java.io.FileOutputStream;

public class WriteText {
    public static void main(String[] args) {
        File dir = new File("d:/tmp");
        dir.mkdirs();
        File f = new File(dir, "abc.txt");
        String text = "Hi, 大家好";
        try {
            byte[] data = text.getBytes("UTF-8");
            System.out.println(data.length);
            FileOutputStream output = new FileOutputStream(f);
            output.write(data);
            output.close();
            System.out.println("write" + f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
