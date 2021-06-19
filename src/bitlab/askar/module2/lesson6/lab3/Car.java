package bitlab.askar.module2.lesson6.lab3;

public class Car extends Thread {

    String carName;
    double speed;
    double distance;

    public Car(String carName, double speed, double distance) {
        this.carName = carName;
        this.speed = speed;
        this.distance = distance;
    }

    public Car(ThreadGroup group, String name, String carName, double speed, double distance) {
        super(group, name);
        this.carName = carName;
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {

        try {
            for (int i=0;i<distance/speed;i++){
                Thread.sleep(1000);
                System.out.println(carName + " is on: " + i*speed);
            }
            System.out.println(carName + " has finished");
        }catch (Exception e){

        }

    }
}
