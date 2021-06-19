package bitlab.askar.module1.lesson9.lab3;

public class Sportsman {

    String fullName;
    int age;
    String country;

    public Sportsman() {
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public void play() {
        System.out.println("sportsman: " + fullName + " aged: " + age + " from: " + country + " is playing");
    }

}
