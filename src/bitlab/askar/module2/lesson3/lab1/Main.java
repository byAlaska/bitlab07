package bitlab.askar.module2.lesson3.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = "projectname";
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("name",10000,10));
        players.add(new Player("Pique",20000,10));
        players.add(new Player("Benzema",30000,10));
        players.add(new Player("Mbappe",40000,10));
        players.add(new Player("Subzero",50000,10));

        double priceSum = 0;
        double ageSum = 0;



        for (Player p:players){
            priceSum += p.getPrice();
            ageSum += p.getAge();
        }


        System.out.println(priceSum);
        System.out.println(ageSum/players.size());


//        System.out.println(players);
        for (Player p:players){
            System.out.println(p);
        }
    }
}
