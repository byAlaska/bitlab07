package bitlab.askar.module1.lesson2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

//        int a = in.nextInt();
//        int b = in.nextInt();
//
//
//
//        if (a>b){
//            System.out.println(a);
//        }else {
//            System.out.println(b);
//        }


//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c =  in.nextInt();
//
//        if ( a>b && a>c){
//            System.out.println(a);
//        } else if (b>c && b>a){
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }
//
//
//        if (a>b){
//            if (a>c) System.out.println(a);
//            else System.out.println(c);
//        }else {
//            if (b>c) System.out.println(b);
//            else System.out.println(c);
//        }


//        System.out.println("1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport:");
//
//        int branch = in.nextInt();
//        int current;
//
//        if (branch == 1) {
//
//            System.out.println("1 - Math, 2 - Physics:");
//            current = in.nextInt();
//
//            if (current == 1){
//                System.out.println("You are Financier");
//            }else{
//                System.out.println("You are Engineer");
//            }
//
//        }else if (branch == 2){
//
//            System.out.println("1 - History, 2 - Foreign Languages:");
//            current = in.nextInt();
//
//            if (current == 1){
//                System.out.println("You are Historic or Diplomat ");
//            }else{
//                System.out.println("You are Translator");
//            }
//
//        }else if (branch == 3){
//
//            System.out.println("1 - Drawing, 2 - Singing:");
//            current = in.nextInt();
//
//            if (current == 1){
//                System.out.println("You are Painter or Architect");
//            }else{
//                System.out.println("You are Singer or Tamada");
//            }
//
//        }else {
//
//            System.out.println("1 - Team, 2 - Individual:");
//            current = in.nextInt();
//            if (current == 1){
//                System.out.println("You are footballer or Basketball player");
//            }else{
//                System.out.println("You are boxer or tennis player");
//            }
//
//        }


//        int ladiaX = in.nextInt();
//        int ladiaY = in.nextInt();
//
//        int figureX = in.nextInt();
//        int figureY = in.nextInt();
//
//        if (ladiaX == figureX || ladiaY == figureY) {
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max;
        int min;


        if (a>b && a>c) {
            max = a;
            if (b>c) min = c;
            else min = b;
        }
        else if (b>a && b>c){
            max = b;
            if (a>c) min = c;
            else min = a;
        }
        else {
            max = c;
            if (b>a) min = a;
            else min = b;
        }

        System.out.println(max - min);

    }
}
