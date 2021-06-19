package bitlab.askar.module1.lesson10;

public class Main {

    public static void main(String[] args){

        Shape []shapes = new Shape[3];
        shapes[0] = new Square(10);
        shapes[1] = new Circle(10);
        shapes[2] = new Traingle(10);

        for (int i=0;i<3;i++){
            shapes[i].getPerimeter();
        }

    }
}
