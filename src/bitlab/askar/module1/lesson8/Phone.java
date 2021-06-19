package bitlab.askar.module1.lesson8;

public class Phone {
    String name;
    String model;
    int price;

    public Phone(){

    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData(){
        return " name : " + name + ", model: " + model + ", price" + price;
    }

}
