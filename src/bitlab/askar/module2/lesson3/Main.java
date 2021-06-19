package bitlab.askar.module2.lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        ArrayList<String> array = new ArrayList<>();
//
//        array.add("ilajsdlk");
//        array.add("asdf");
//        array.add("asdf");
//        array.add("rtu-");
//        array.add("sh");
//
//        for (String po: array){
//            System.out.println(po);
//        }

//
//        array.add(2,"hello");
//
//        System.out.println("------------------------");
//
//        array.remove("asdf");
//        array.remove(2);
//
//        for (int i=0;i<array.size();i++){
//            System.out.println(array.get(i));
//        }


//        LinkedHashSet<String> set = new LinkedHashSet<>();
//
//        set.add("asdf");
//        set.add("rtu");
//        set.add("sh");
//        set.add("ilajsdlk");
//
//        System.out.println(set);


//        HashMap<String, String> map = new HashMap<>();

//        map.put("kajsdf","name");
//        map.put("asdf","asdg");
//        map.put("qwe","name");
//        map.put("po","gkoe2pw");


//        System.out.println(map.get("kajsdf"));
//        System.out.println(map.get("po"));
//        System.out.println(map.get("qwe"));

        Stack<String> strings = new Stack<>();

        strings.push("qwe");
        strings.push("asdf");
        strings.push("uio");


        System.out.println(strings.pop());
        System.out.println(strings.pop());

        strings.push("here");

        System.out.println(strings.pop());
        System.out.println(strings.pop());


    }
}
