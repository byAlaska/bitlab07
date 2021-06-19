package bitlab.askar.module1.lesson7;

public class Lab {
    public static void main(String[] args){


//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int []array = new int[n];
//
//        for (int i=0;i<n;i++){
//            array[i] = in.nextInt();
//        }

//        array = switchMaxMin(array);



//        getMinAndMax(array);
//        uniqueArray(array);


//        boolean b = ifExist(2,2,3);
//
//        if (b){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }

    }

    //[1] [2] [3] [2] [1] [2]
    //array[i] = array[i]
    // i j

    //10

//    public static void uniqueArray(int []array){
//
//        for (int i=0;i<array.length;i++){
//            boolean b = true;
//            for (int j=0;j<array.length;j++){
//                if (array[i] == array[j] && i!=j){
//                    b = false;
//                    break;
//                }
//            }
//
//            if (b) {
//                System.out.println(array[i]);
//            }
//        }
//
//    }


    //12
//    public static void getMinAndMax(int []array){
//
//        int min = array[0];
//        int max = array[0];
//        for (int i=0;i<array.length;i++){
//            if (array[i] > max){
//                max = array[i];
//            }
//            if (array[i]< min ){
//                min = array[i];
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(min);
//
//    }

    //2
//    public static boolean ifExist(int a, int b, int c){
//
//        if (a+b>c && a+c>b && c+b>a) return true;
//        return false;
//
//    }


    //27
//    public static int[] switchMaxMin(int[] array){
//
//        int max = array[0];
//        int maxI = 0;
//        int min = array[0];
//        int minI = 0;
//        for (int i=0;i<array.length;i++){
//            if (array[i]<min){
//                min = array[i];
//                minI = i;
//            }
//            if (array[i]>max){
//                max= array[i];
//                maxI = i;
//            }
//        }
//
//        array[minI] = max;
//        array[maxI] = min;
//
//        return array;
//
//    }
}
