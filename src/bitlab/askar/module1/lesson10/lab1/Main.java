package bitlab.askar.module1.lesson10.lab1;

public class Main {

    public static void main(String[] args){

        Chocolate chocolate = new Chocolate("alpen gold", 100);
        Chocolate chocolate2 = new Chocolate("Kazakhstan",200);

        Coke coke = new Coke("Cola",10,true);
        Coke coke2 = new Coke("Juice",5,false);

        Burger burger = new Burger("Bahandi",2,1);
        Burger burger2 = new Burger("MacDak", 3,2);

        Food []food = {chocolate, chocolate2, coke,coke2, burger,burger2};

        double max = food[0].getCalories();
        for(int i=0;i<food.length;i++){
            System.out.println(food[i].getCalories());
            if (max<food[i].getCalories()){
                max = food[i].getCalories();
            }
        }

        System.out.println("MAX: " + max);



    }

}
