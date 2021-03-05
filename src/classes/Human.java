package classes;

public class Human {
    public String name;
    public Human mate;

    void merryWith(Human someone) {
        this.mate = someone;
        someone.mate = this;
    }

    void introduce() {
        if (this.mate != null) {
            System.out.println("My name is " + this.name + ", My mate is " + this.mate.name + ".");
        } else {
            System.out.println("My name is " + this.name + ", I am single.");
        }
    }

    public static void main(String[] args) {
        Human a = new Human();
        Human b = new Human();
        a.name = "Lily";
        b.name = "Tom";
        a.merryWith(b);
        a.introduce();
        b.introduce();

        Human c = new Human();
        c.name = "John";
        c.introduce();
    }
}
