package bitlab.askar.module1.lesson9.lab3;

public class Swimmer extends Sportsman {
    String style;
    double recordTime;

    public Swimmer() {
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    @Override
    public void play() {
        System.out.print("with record time: " + recordTime + ", style: " + style);
        super.play();
    }
}
