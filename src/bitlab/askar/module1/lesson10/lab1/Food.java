package bitlab.askar.module1.lesson10.lab1;

public abstract class Food {
    protected String name;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public abstract double getCalories();
}
