package logic;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 7 == 0) {
                continue;
            } else if (i >= 70 && i <= 79) {
                continue;
            } else if (i % 10 == 7) {
                continue;
            } else if (i > 140) {
                break;
            }
            System.out.println(i);
        }
    }
}
