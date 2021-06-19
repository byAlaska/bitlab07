package bitlab.askar.module1.lesson9;

public class Animal {

    String color;
    int age;
    int height;
    String male;

    public Animal() {
    }

    public Animal(String color, int age, int height, String male) {
        this.color = color;
        this.age = age;
        this.height = height;
        this.male = male;
    }

    public void run() {
        System.out.println("Animal with age: " + age + " is running ");
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", male='" + male + '\'';
    }
}
