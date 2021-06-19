package bitlab.askar.module1.AlyaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class SnackTower {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> sortedArrayList = new ArrayList<>();

        int current = n;


        for (int i = n; i > 0; i--) {
            int x = in.nextInt();
            if (current==x){
                current--;
                String next = "";
                next += x + " ";
                while (sortedArrayList.contains(current)){
                    next += current + " ";
                    current--;
                }
                arrayList.add(next);
            }else {
                sortedArrayList.add(x);
                arrayList.add("");
            }
        }


        for (String s:arrayList){
            System.out.println(s);
        }

    }
}
