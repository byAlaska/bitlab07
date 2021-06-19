package bitlab.askar.module1.lesson6;

import java.util.Scanner;

public class Lection {
    public static void main(String []args){


        Scanner in = new Scanner(System.in);

        int [][]array = new int[3][5];


        array[1][2] = 10;

        //[0] [] [] [] [] <- 0
        //[] [] [10] [] []  <- 1
        //[] [] [] [] [] <- 2

        // 0  1  2  3  4


        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                array[i][j] = in.nextInt();
            }
        }


        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
//
//




//        int [][]array = {
//                {12,5,7,6},
//                {4,0,2,7},
//                {9,1,3,2},
//                {10,-2,4,6}
//        };
//
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        System.out.println(array[n][m]);




    }
}
