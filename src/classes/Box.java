package classes;

class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box() {
        width = 10;
        height = 10;
        depth = 10;
        System.out.println("Constructing initial Box.");
    }

    //带自变量的构造函数
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Constructing user-defined Box.");
    }

    Box(double l) {
        width = l;
        height = l;
        depth = l;
        System.out.println("Constructing Cube.");
    }
}
