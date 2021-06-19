package bitlab.askar.module2.lesson5.lab2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Game game = null;

        while (true){
            System.out.println(" PRESS 1 TO CREATE GAME");
            System.out.println(" PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println(" PRESS 3 TO PLAY GAME");
            System.out.println(" PRESS 0 TO EXIT");

            int choice = in.nextInt();

            if (choice==1) {
                String name = in.next();
                String ip = in.next();
                int port = in.nextInt();

                game = new Game(name, ip, port);
                saveGame(game);
            }else if(choice==2){
                String nickName = in.next();
                double rating = in.nextDouble();

                Player player = new Player(nickName, rating);
                try {
                    game.getPlayers().add(player);
                    saveGame(game);
                }catch (NullPointerException e){
                    System.out.println("You did not create a game");
                }
            }else if (choice==3){
                System.out.println(playGame());
            }
        }

    }

    public static void saveGame(Game game){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("game.txt"));
            outputStream.writeObject(game);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Game playGame() {
        Game game = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("game.txt"));
            game = (Game)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return game;
    }
}
