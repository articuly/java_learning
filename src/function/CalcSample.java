package function;

public class CalcSample {
    public static void main(String[] argsL) {
        int i = 5;
        System.out.println("number:" + i);
        System.out.println("square:" + i * i);
        System.out.println("cube:" + i * i * i);

        double x = 23;
        double y = 7;
        System.out.println("result:" + x / y);
        System.out.println(x < y + 1);
        System.out.println(x < y + 20);

        boolean j = true;
        boolean k = false;
        System.out.println(j && k);
        System.out.println(j || k);
        System.out.println(!j);
    }
}
