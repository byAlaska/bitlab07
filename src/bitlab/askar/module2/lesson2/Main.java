package bitlab.askar.module2.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



//        int c;
//
//        try {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.println(a/b);
//            c = in.nextInt();
//            System.out.println(c);
//        }catch (ArithmeticException e){
//            System.out.println("You divided into 0");
//        }catch (InputMismatchException e){
//            System.out.println("You wrote wrong number");
//        }
//
//        System.out.println("FINISHED");


        BankApplication application = new BankApplication();

        try {
            application.createUser("ajskldgasldkg");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
