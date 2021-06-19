package bitlab.askar.module1.lesson9;

import bitlab.askar.module1.lesson8.Human;

public class Dog extends Animal {

    String breed;
    Human owner;

    public Dog(String color, int age, int height, String male, String breed, Human owner) {
        super(color, age, height, male);
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public void run() {
        System.out.println("DOG with breed: " + breed + " is running ");
    }

    public void gafGaf(){

    }

    @Override
    public String toString() {
        return "breed='" + breed + '\'' +
                ", owner=" + owner +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", male='" + male + '\'';
    }
}
