package bitlab.askar.module1.lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

//        Human h = new Human(20, "Bob", "Marley", "old");


//        System.out.println(h.getAge());
//        h.setAge(10);
//        h.setAge(10);
//        System.out.println(h.getAge());

//        System.out.println(h.getPassword());


//        Human h2 = new Human();
//        h2.run();
//
//        h2.surname = "Scottish";
//
//        h2.run();

//
//
//        Human h3 = new Human();
//
//        h3.name = "Jeremy";
//        h3.age = 2;
//        h3.surname = "Patrick";


//        h2.run();
//        h3.run();


        Phone phone = new Phone("RX102i50NKAG","Samsung",100000);
        Phone phone2 = new Phone("02390HAFG","XIAOMI",100000);
        Phone phone3 = new Phone("iPhone 11","Iphone",1000000);
        Phone phone4 = new Phone("REDMI PRO","REDMI",10000);
        Phone phone5 = new Phone("Nokia 1929","Nokia",100);

        System.out.println(phone.getData());
        System.out.println(phone2.getData());
        System.out.println(phone3.getData());
        System.out.println(phone4.getData());
        System.out.println(phone5.getData());


        Human human = new Human(19,"Name","HumanSurname","password", phone2);

        System.out.println(human.getData());

    }
}
