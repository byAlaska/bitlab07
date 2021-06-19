package bitlab.askar.module1.lesson7;

import java.util.Scanner;

public class Lection {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        sayWord("Hello", 10);
//        sayWord("Byebye", 5);
//        sayWord("Uiwejaig", 20);
//        sayWord("LIASJGIA",2);
//        sayWord("AGJSIGJQOIJQGO",1);



//        String madrid [] = {"Navas", "Ramos", "Ronaldo"};
//        String barcelona [] = {"Ter Stegen", "Messi", "Suarez"};
//        String juventus [] = {"Buffon", "Dybala", "Higuain"};
//        String bayern [] = {"Neuer", "Robben", "Lewandowski"};
//
//
//
//        printTeams(madrid, "Real Madrid");
//        printTeams(barcelona, "Barcelona ");
//        printTeams(juventus, "Juventus");
//        printTeams(bayern, "Bayern");


        // f(x) =  y = x^2

//        String sum = f(5);
//
//        System.out.println(sum);

//        getMax(1,2,4);



        // 1 1 2 3 5 8 13 21 34 55 89


//        int n = in.nextInt();
//
//
//        int []array = new int[n];
//
//        array[0] = 1;
//        array[1] = 1;
//        array[2] = 2;
//
//        for (int i=2;i<n;i++){
//            array[i] = array[i-1] + array[i-2];
//        }
//
//        System.out.println(array[n-1]);



        fibonacci(5);
        fibonacci(150);

        //
    }


    public static int fibonacci(int n){
        if (n==1) return 1;
        if (n==2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }











    public static int getMax(int []array){
        return 0;
    }


    public static int getMax(int x, int y){
        return 0;
    }



    public static int getMax(int x, int y, int z){

        if (x>y && x>z)return x;
        if (y>x && y>z)return y;
        return z;
    }


    public static String f(int x){

        int sum = 0;
        for (int i =0;i<x;i++){
            sum += i;
        }

        return "HEre is " + sum;
    }


    public static void printTeams(String []array, String teamName){

        System.out.println("------------------------------------");
        System.out.println(teamName);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " , ");
        }

        System.out.println();

    }



    public static void sayWord(String word, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }

    }


}
