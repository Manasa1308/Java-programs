abstract class Shape {
    abstract void printArea();
}

class Rectangle extends Shape {
    int length, width;
    Rectangle(int l, int w) { length = l; width = w; }
    void printArea() { System.out.println(length * width); }
}

class Triangle extends Shape {
    int base, height;
    Triangle(int b, int h) { base = b; height = h; }
    void printArea() { System.out.println(0.5 * base * height); }
}

class Circle extends Shape {
    int radius;
    Circle(int r) { radius = r; }
    void printArea() { System.out.println(Math.PI * radius * radius); }
}

public class Main {
    public static void main(String[] args) {
        new Rectangle(10, 5).printArea();
        new Triangle(10, 8).printArea();
        new Circle(7).printArea();
    }
}