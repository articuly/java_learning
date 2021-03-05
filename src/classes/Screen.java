package classes;

public class Screen {
    public int width;
    public int height;

    int pixels() {
        int result = this.width * this.height;
        return result;
    }

    public static void main(String[] args) {
        Screen sc = new Screen();
        sc.width = 1920;
        sc.height = 1080;
        int p = sc.pixels();
        System.out.println(p);
    }
}
