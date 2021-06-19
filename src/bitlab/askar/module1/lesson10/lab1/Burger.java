package bitlab.askar.module1.lesson10.lab1;

public class Burger extends Food {
    private int meatAmount;
    private int meatType;

    public Burger() {
    }

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    @Override
    public double getCalories() {
        if (meatType==1) return meatAmount * 840;
        return meatAmount * 560;
    }
}
