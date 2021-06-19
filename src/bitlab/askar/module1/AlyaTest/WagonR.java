package bitlab.askar.module1.AlyaTest;

public class WagonR extends Car {

    public WagonR(){
        super(false, "4");
    }


    public WagonR(int mileage){
        super(false, "4");
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage +" kmpl.";
    }
}
