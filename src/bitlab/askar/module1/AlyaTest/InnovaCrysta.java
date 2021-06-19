package bitlab.askar.module1.AlyaTest;

public class InnovaCrysta extends Car {

    public InnovaCrysta(){
        super(false, "6");
    }

    public InnovaCrysta(int mileage){
        super(true, "6");
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl.";
    }
}
