package bitlab.askar.module1.AlyaTest;

public class HondaCity extends Car {

    public HondaCity() {
        super(true, "4");
    }

    public HondaCity(int mileage){
        super(true, "4");
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl.";
    }
}
