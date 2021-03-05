package classes;

public class ATM {
    private double money = 0;

    void setMoney(double money) {
        this.money = money;
    }

    void saveCash(double cash) {
        this.money += cash;
        System.out.println("you have saved " + cash);
        System.out.println("your balance is " + this.money);
    }

    void withdrawCash(double cash) {
        if (cash <= this.money) {
            this.money -= cash;
            System.out.println("you have withdraw " + cash);
            System.out.println("your balance is " + this.money);
        } else {
            System.out.println("you can not withdraw " + cash + ", you do not have enough money.");
        }
    }

    public static void main(String[] args) {
        ATM m = new ATM();
        m.setMoney(100);
        m.saveCash(200);
        m.withdrawCash(300);
        m.withdrawCash(100);
    }
}
