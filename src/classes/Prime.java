package classes;

public class Prime {
    public boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void showPrime(int m, int n) {
        for (int i = n; i <= m; i++) {
            if (this.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Prime p = new Prime();
        p.showPrime(100, 2);
    }
}
