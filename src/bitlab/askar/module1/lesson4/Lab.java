package bitlab.askar.module1.lesson4;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

//        24
//        int n = in.nextInt();
//        int []array = new int[n];
//
//        for (int i=0;i<array.length;i++){
//            array[i] = in.nextInt();
//        }
//
//        int m = in.nextInt();
//
//        boolean b = false;
//        int index = 0;
//        for (int i=0;i<n;i++){
//            if (m == array[i]){
//                b = true;
//                index = i;
//            }
//        }
//
//
//        if (b){
//            System.out.println("Yes");
//            System.out.println(index);
//        }else {
//            System.out.println("No");
//        }



//      28
//        int n = in.nextInt();
//        int []array = new int[n];
//
//        for (int i=0;i<array.length;i++){
//            array[i] = in.nextInt();
//        }
//        //6 19 26 3 46 8 5 65 90 25
//        //6 26 46 8 90 = 5
//
//        int count = 0;
//        for (int i=0;i<n;i++){
//            if (array[i]%2==0){
//                count++;
//            }
//        }
//
//        int []result = new int[count];
//        // [6] [26] [46] [8] [90]
//        // j = 5
//
//        int j = 0;
//        for (int i=0;i<n;i++){
//            if (array[i]%2==0){
//                result[j] = array[i];
//                j++;
//            }
//        }
//
//        for (int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }


        //29

        int n = in.nextInt();
        int []array = new int[n];

        for (int i=0;i<array.length;i++){
            array[i] = in.nextInt();
        }


        //6 19 0 -3 4 8 0 -6 9 5
        int sum = 0;
        boolean b = true; // true = -> первый 0
        // false -> второй 0, нужно делать брейк

        for (int i=0;i<n;i++){

            if (!b){
                sum += array[i];
            }

            if (array[i]==0 && b){
                sum += array[i];
                b = false;
            }else if (array[i]==0 && !b){
                break;
            }

        }

        System.out.println(sum);


    }

}
