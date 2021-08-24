package infa;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDeci {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        BigDecimal numeric = new BigDecimal(in.nextDouble());
        BigDecimal refHigh = new BigDecimal(70);
        BigDecimal refLow = new BigDecimal(30);
        BigDecimal nullPointer = new BigDecimal(999);

        if (numeric.compareTo(refHigh) > 0) {
            System.out.println("more higher");
        } else if (numeric.compareTo(refLow) < 0) {
            System.out.println("more lower");
        } else if (numeric.compareTo(nullPointer) == 0) {
            System.out.println("null");
        } else {
            System.out.println("other");
        }
    }
}
