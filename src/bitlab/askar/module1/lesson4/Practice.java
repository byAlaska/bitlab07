package bitlab.askar.module1.lesson4;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        int[] nums = {6,19,26,9,46,8,5,65,90,25};
//
//        int index = in.nextInt();
//
//        System.out.println(nums[index]);


//        int n = in.nextInt();
//
//        int []number = new int[n];
//        // [5] [10] [11] [60] [-4] [-3]
//        for (int i=0;i<n;i++){
//            number[i] = in.nextInt();
//        }
//
//        for (int i=0;i<n;i++){
//            System.out.println(number[i]);
//        }


//        int n = in.nextInt();
//
//        int []numbers = new int[n];
//
//        for (int i=0;i<n;i++){
//            numbers[i] = in.nextInt();
//        }
//
//        double sum = 0;
//        int counter = 0;
//        for (int i=0;i<n;i++){
//            if (numbers[i]%2==0){
//                sum += numbers[i];
//                counter++;
//            }
//        }
//
//        System.out.println(sum/counter);


        // -4 10 -5 12 -9 90 -100 100

//        int n = in.nextInt();
//
//        int []numbers = new int[n];
//
//        for (int i=0;i<n;i++){
//            numbers[i] = in.nextInt();
//        }
//
//        boolean b = true;
//        for (int i=0;i<n;i++){
//            if (numbers[0]>0){
//                if (i%2==1){
//                    if (numbers[i]<0){
//                        b = true;
//                    }else {
//                        b = false;
//                        break;
//                    }
//                }else {
//                    if (numbers[i]>0){
//                        b = true;
//                    }else {
//                        b = false;
//                        break;
//                    }
//                }
//            }else {
//                if (i%2==1){
//                    if (numbers[i]>0){
//                        b = true;
//                    }else {
//                        b = false;
//                        break;
//                    }
//                }else {
//                    if (numbers[i]<0){
//                        b = true;
//                    }else {
//                        b = false;
//                        break;
//                    }
//                }
//            }
//
//        }
//
//
//        if (b){
//            System.out.println("yes");
//        }else {
//            System.out.println("NO");
//        }


//        int n = in.nextInt();
//
//        int[] numbers = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            numbers[i] = in.nextInt();
//        }
//
//
//        // -1 2 -3 4 -5 6 -7 8 -9 10
//
//        boolean b = true;
//        boolean b2; //true -> 0>0
//        if (numbers[0] > 0) b2 = true;
//        else b2 = false;
//
//        // [] [] [] [] [] []
//
//        for (int i = 0; i < n - 1; i += 2) {
//
//            if (b2 && n % 2 == 0) {
//                if (numbers[i] > 0 && numbers[i + 1] < 0) b = true;
//                else {
//                    b = false;
//                    break;
//                }
//            } else if (!b2 && n % 2 == 1) {
//                if (numbers[i] < 0 && numbers[i] > 0) b = true;
//                else {
//                    b = false;
//                    break;
//                }
//            }else if (!b2 && n % 2 != 0) {
//                if (numbers[i] < 0 && numbers[i + 1] > 0) b = true;
//                else {
//                    b = false;
//                    break;
//                }
//            }else {
//                if (numbers[i] > 0 && numbers[i + 1] < 0) b = true;
//                else {
//                    b = false;
//                    break;
//                }
//            }
//        }
//
//
//        if(b) {
//            System.out.println("yes");
//        } else {
//            System.out.println("NO");
//        }

    }
}
