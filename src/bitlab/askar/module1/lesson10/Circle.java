package bitlab.askar.module1.lesson10;

public class Circle extends Shape {
    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.14;
    }
}
