package bitlab.askar.module1.lesson8;

public class Human {

    private int age;
    private String name;
    private String surname;
    private String password;
    private Phone phone;

    public Human(){
    }

    public Human(int age, String name, String surname, String password, Phone phone){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.phone = phone;
    }

    public String getData() {
        return "age:" + age+ ", name: " + name + ", Phone: " + phone.getData();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void run(){
        System.out.println("Human with name " + name + " with age: " + age + " IS RUNNING");
    }

    public void eat() {
        System.out.println("human: " + name + " is eating");
    }

}