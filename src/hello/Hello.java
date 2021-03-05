package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // 测试打印与输入
        System.out.println("Hello World");
        System.out.println("你好，中文");
        Scanner in = new Scanner(System.in);
        System.out.println("echo:" + in.nextLine());
        System.out.println("2+3=" + 5);
        System.out.println("2+3=" + (2 + 3));
        System.out.println(2 + 3 + "=2+3=" + (2 + 3));
        int price = 0;
        price = in.nextInt();
        System.out.println("100-" + price + "=" + (100 - price));

        String s = "China is a great country";
        int pos = s.indexOf("a");
        System.out.println(pos);
    }
}
