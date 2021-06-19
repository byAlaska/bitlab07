package bitlab.askar.module1.lesson9.lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String city = in.next();
        int year = in.nextInt();

        Sportsman []sportsmen = {
                new Gymnast("Aboba", 23 , "Kaz", 180, 80, "Classic"),
                new Footballer("Aboba", 23 , "Kaz", "Attacker", "Almaty"),
                new Swimmer("Aboba", 23 , "Kaz", "Classic", 20.0),
        };

        OlympicGames olympicGames = new OlympicGames(city, year, sportsmen);
        olympicGames.playSportsmen();


    }
}
