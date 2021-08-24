package infa;

import java.util.Scanner;

public class DoubleCompare {
    public static void main(String[] args) {
        String hh="70";
        String ll="30";
        double h;
        h = Double.parseDouble(hh);
        double l = Double.parseDouble(ll);
        double n;
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();

        if (Double.doubleToLongBits(n) > Double.doubleToLongBits(h)) {
            System.out.println("high");
        } else if (Double.doubleToLongBits(n) < Double.doubleToLongBits(l)) {
            System.out.println("low");
        } else {
            System.out.println("nothing");
        }
    }
}
