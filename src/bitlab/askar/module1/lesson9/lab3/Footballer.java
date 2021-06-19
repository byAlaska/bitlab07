package bitlab.askar.module1.lesson9.lab3;

public class Footballer extends Sportsman {
    String position;
    String club;

    public Footballer() {
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    public void play() {
        System.out.print("with position " + position + ", club: " + club);
        super.play();
    }
}
