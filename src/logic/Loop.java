package logic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        if (num % 2 == 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
