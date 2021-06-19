package bitlab.askar.module1.lesson10;

public class Traingle extends Shape {

    int width;

    public Traingle() {
    }

    public Traingle(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 3*width;
    }
}
