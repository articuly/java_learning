package hello;

import java.math.BigDecimal;

public class ResultFlagging {
    public static void main(String[] args) {
        String s = "abc * (#ghi";
        String f0 = new String();
        String f1 = new String();
        String f2 = new String();
        int p1;
        int p2;
        BigDecimal l = new BigDecimal(1.0);
        BigDecimal h = new BigDecimal(9.0);
        // null point
        BigDecimal rn = new BigDecimal("10");
        p1 = s.lastIndexOf(" ") + 1;
        p2 = s.lastIndexOf(" ", p1 - 2) + 1;
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);

        if (p1 > 0 && p2 > 0 && s.substring(p1, p1 + 2).equals("(#")) {
            f0 = s.substring(p2, p1 - 1).trim();
            System.out.println("A cond");
        } else {
            if (p1 > 0) {
                f0 = s.substring(p1).trim();
                System.out.println("B cond");
            } else {
                f0 = null;
                System.out.println("C cond");
            }
        }
        System.out.println("f0 is " + f0);

        if (f0 != null) {
            if (f0.length() == 1) {
                f1 = f0;
                System.out.println("D cond");
            } else {
                f1 = null;
                System.out.println("E cond");
            }
        } else {
            f1 = null;
            System.out.println("F cond");
        }
        System.out.println("f1 is " + f1);

        if (f1 != null) {
            if (f1.equals("*")) {
                if (String.valueOf(rn) == null) {
                    f2 = "*";
                } else if (rn.compareTo(h) > 0) {
                    f2 = "H";
                } else if (rn.compareTo(l) < 0) {
                    f2 = "L";
                } else {
                    f2 = null;
                }
            } else {
                f2 = f1;
            }
        } else {
            f2 = null;
        }
        System.out.println("f2 is " + f2);
    }
}
