package bitlab.askar.module2.lesson2.lab2;

import java.util.Arrays;

public class Library {
    String name;
    String city;
    Book books[] = new Book[20];
    int index = 0;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void addBook(Book book){
        try {
            books[index] = book;
            index++;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }catch (NullPointerException e){
            System.out.println("Null came");
        }
    }

    public void printBooks(){
        for (int i=0;i<index;i++){
            if (books[i]==null){
                System.out.println("the book is empty");
            }else {
                System.out.println(books[i]);

            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", books=" + Arrays.toString(books) +
                ", index=" + index +
                '}';
    }
}
