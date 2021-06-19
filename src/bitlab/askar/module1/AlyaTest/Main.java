package bitlab.askar.module1.AlyaTest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("HEllo");

//        int choice = in.nextInt();
//
//        Car car;
//        String carName;
//        if (choice==0){
//            int mileage = in.nextInt();
//            carName = "A WagonR";
//            car = new WagonR(mileage);
//        }else if (choice==1){
//            int mileage = in.nextInt();
//            carName = "A HondaCity";
//            car = new HondaCity(mileage);
//        }else {
//            int mileage = in.nextInt();
//            carName = "A InnovaCrysta";
//            car = new InnovaCrysta(mileage);
//        }
//
//        System.out.println(carName + car.getIsSedan() + car.getSeats() + " and has a milage around " + car.getMileage());

        Set<String > set2 = new TreeSet<String>();

        Comparator.comparing(String::length);

        set2.add("Taraz");
        set2.add("Semei");
        set2.add("Oskemen");
        set2.add("Aktau");

        System.out.println(set2.size());

    }
}
