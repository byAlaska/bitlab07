package bitlab.askar.module1.lesson10.lab1;

public class Coke  extends Food{

    private double volumeLiters;
    private boolean isSparkling;

    public Coke() {
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling) return volumeLiters * 400;
        return volumeLiters * 100;
    }
}
