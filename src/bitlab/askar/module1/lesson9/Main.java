package bitlab.askar.module1.lesson9;

import bitlab.askar.module1.lesson8.Human;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("black",23,129, "Male");
        Dog dog = new Dog("gray",20,130, "female", "Chihuahua", new Human());
        Dog dog2 = new Dog("red",10,230, "male", "Boria", new Human());
        Frog frog = new Frog("black",21,129, "Male", 10,10);
        Frog frog2 = new Frog("green",22,139, "Male", 10,20);

//        Animal []animals = {animal,dog,dog2,frog,frog2};
//
//        for (int i=0;i<animals.length;i++){
//            animals[i].run();
//        }

        getAnimal(dog);

//        animal.run();
//        dog.run();
//        frog.run();
//
//        System.out.println(animal.toString());
//        System.out.println(dog.toString());
//        System.out.println(frog.toString());

//        frog.run();
//        frog.run("1000");

    }

    public static void getAnimal(Animal animal){

        if (animal instanceof Dog){

            Dog dog = (Dog)animal;
            dog.gafGaf();

        }else {

            animal.run();

        }

    }
}
