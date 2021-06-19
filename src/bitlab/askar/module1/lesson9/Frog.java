package bitlab.askar.module1.lesson9;

public class Frog extends Animal{

    int poison;
    int legs;


    public Frog(String color, int age, int height, String male, int poison, int legs) {
        super(color, age, height, male);
        this.poison = poison;
        this.legs = legs;
    }

    @Override
    public void run() {
        System.out.println("Animal with age: " + age + " is running ");
    }

    public void run(String distance){
        System.out.println("Frog with age: " + age + " is running until " + distance);
    }

}
