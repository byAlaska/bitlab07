package bitlab.askar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String password = in.next();

        if (password.equals("qwerty")){
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect");
        }



    }
}
