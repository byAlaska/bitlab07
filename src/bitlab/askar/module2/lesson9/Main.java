package bitlab.askar.module2.lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Database database = new Database();
        database.connect();
//        ArrayList<Student> students = database.getAllStudents();
//
//        for (Student student: students){
//            System.out.println(student);
//        }


        String name = in.next();
        String surname = in.next();
        double gpa = in.nextDouble();

        Student student = new Student(name,surname,gpa);
        database.addStudent(student);


    }
}
