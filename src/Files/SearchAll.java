package Files;

import java.io.File;

public class SearchAll {
    public static void search(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File f : files) {
            if (f.isFile()) {
                System.out.println("文件：" + f.getAbsolutePath());
            } else {
                System.out.println("目录：" + f.getAbsolutePath());
                search(f); // 递归调用
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("D:\\OneDrive - business\\我的坚果云");
        search(f);
    }
}
