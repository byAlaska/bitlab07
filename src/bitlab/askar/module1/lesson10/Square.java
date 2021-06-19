package bitlab.askar.module1.lesson10;

public class Square extends Shape {

    int width;

    public Square() {
    }

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return width*4;
    }

}
