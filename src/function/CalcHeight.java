package function;

import java.util.Scanner;

public class CalcHeight {
    public static void main(String[] args) {
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        System.out.println("foot"+foot+", inch="+inch);
        System.out.println((int)((foot + inch / 12) * 0.3041 * 100));
    }
}