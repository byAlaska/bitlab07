package bitlab.askar.module1.AlyaTest;

public abstract class Car {

    boolean isSedan;
    String seats;
    int mileage;

    public Car(boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    protected Car() {
    }

    public String getSeats() {
        return " is " + seats + "-seater,";
    }

    public String getIsSedan() {
        if (isSedan) return " is not Sedan,";
        return " is Sedan,";
    }

    public abstract String getMileage();
}
