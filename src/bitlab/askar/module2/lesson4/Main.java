package bitlab.askar.module2.lesson4;

import bitlab.askar.module2.lesson5.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        ArrayList<User> users = readText();

        while (true){

            System.out.println("[1] add product");
            System.out.println("[2] list product");
            System.out.println("[0] exit");

            int choice = in.nextInt();

            if (choice==1){
                int id = in.nextInt();
                String login = in.next();
                String password = in.next();
                users.add(new User(id,login,password));
                writeText(users);
            }else if (choice==2){
                System.out.println(users);
            }else {
                break;
            }

        }

    }

    private static ArrayList<User> readText() {

        ArrayList<User> users = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("users.txt"));
            users = (ArrayList<User>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return users;
    }

    private static void writeText(ArrayList<User> users) {
        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("users.txt"));
            outputStream.writeObject(users);
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
