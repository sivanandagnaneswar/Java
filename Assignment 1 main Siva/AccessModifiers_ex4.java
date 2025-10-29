abstract class Shape {
    abstract void showArea();
}

class Rectangle extends Shape {
    final int length = 5;
    final int breadth = 4;

    void showArea() {
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

public class AccessModifiers_ex4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.showArea();
    }
}