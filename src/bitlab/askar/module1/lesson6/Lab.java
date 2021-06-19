package bitlab.askar.module1.lesson6;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int [][]array = new int[n][m];
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                array[i][j] = in.nextInt();
//            }
//        }
//
        //  0  1  2  3   4
//        //[] [] [] [] [] == 100 0
//        //[16] [] [] [] [50] == 100  1
//        //[] [] [] [] []  2
//        //[] [] [] [] []  3
//        //[] [] [] [0] []  4
//        // ------------
//
//        for (int i=0;i<n;i++){
//
//            int max = array[i][0];
//
//            for (int j=0;j<m;j++){
//                if (max<array[i][j]){
//                    max = array[i][j];
//                }
//            }
//
//            System.out.println(max);
//
//        }

//
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int [][]array = new int[n][m];
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                array[i][j] = in.nextInt();
//            }
//        }
//
//        int max = array[0][0];
//        int maxRow = 0;
//        int maxCol = 0;
//        int min = array[0][0];
//        int minRow = 0;
//        int minCol = 0;
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if (array[i][j]>max){
//                    max = array[i][j];
//                    maxRow = i;
//                    maxCol = j;
//                }
//                if (array[i][j]<min){
//                    min = array[i][j];
//                    minRow = i;
//                    minCol = j;
//                }
//            }
//        }
//
//        array[maxRow][maxCol] = min;
//        array[minRow][minCol] = max;
//
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//
//
//   i =   0  1  2  3  4    j
        //[0,0] [0,1] [0,2] [0,3] [0,4]    0
        //[1,0] [1,1] [1,2] [1,3] [1,4]    1
        //[2,0] [2,1] [2,2] [2,3] [2,4]    2
        //[3,0] [3,1] [3,2] [3,3] [3,4]    3
        //[4,0] [4,1] [4,2] [4,3] [4,4]    4

//
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int [][]array = new int[n][m];
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                array[i][j] = in.nextInt();
//            }
//        }
//
//        for (int i=0;i<m;i++){
//            int max = array[0][i];
//            int maxJ = 0;
//            int min = array[0][i];
//            int minJ = 0;
//
//            for (int j=0;j<n;j++){
//
//                if (max<array[j][i]){
//                    max = array[j][i];
//                    maxJ = j;
//                }
//
//                if (min>array[j][i]){
//                    min = array[j][i];
//                    minJ = j;
//                }
//            }
//
//            array[maxJ][i] = min;
//            array[minJ][i] = max;
//
//        }
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int[][] array = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                array[i][j] = in.nextInt();
//            }
//        }
//        int k = in.nextInt();
//
//        String[][] result = new String[k][m];
//
//        for (int i = 0; i < m; i++) {
//            int cnt = 0;
//
//
//            for (int j = 0; j < n; j++) {
//                if (cnt < k) {
//                    if (array[j][i] < 0) {
//                        result[cnt][i] = array[j][i] + "";
//                        cnt++;
//                    }
//                } else {
//                    break;
//                }
//            }
//
//            while (cnt < k) {
//                result[cnt][i] = "X";
//                cnt++;
//            }
//
//        }
//
//
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }





    }
}
