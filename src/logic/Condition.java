package logic;


import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        s = in.nextInt();
        System.out.println("Your score:" + s);
        if (s >= 90) {
            System.out.println("Your grade is A.");
        } else if (s >= 80) {
            System.out.println("Your grade is B.");
        } else if (s >= 70) {
            System.out.println("Your grade is C.");
        } else if (s >= 60) {
            System.out.println("Your grade is D.");
        } else {
            System.out.println("Your grade is F.");
        }
    }
}
