package bitlab.askar.module1.lesson9.lab3;

public class Gymnast extends Sportsman {

    int height;
    int weight;
    String style;

    public Gymnast() {
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    public void play() {
        System.out.print("with height " + height + " with weight: " + weight + ", style: " + style);
        super.play();
    }
}
