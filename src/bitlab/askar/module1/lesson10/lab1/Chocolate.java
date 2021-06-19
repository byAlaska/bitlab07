package bitlab.askar.module1.lesson10.lab1;

public class Chocolate extends Food {
    private int weight;

    public Chocolate() {
    }

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return weight * 740.;
    }
}
