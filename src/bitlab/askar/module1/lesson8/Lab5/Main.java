package bitlab.askar.module1.lesson8.Lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Student []students = new Student[10];
        int cnt = 0;
        while (true){
            System.out.println("PRESS [1] TO ADD STUDENT\n" +
                    "PRESS [2] TO LIST STUDENT\n" +
                    "PRESS [0] TO EXIT");

            int choice = in.nextInt();

            if (choice==1){
                System.out.println("Insert name? ");
                String name = in.next();
                System.out.println("Insert surname? ");
                String surname = in.next();
                System.out.println("Insert GPA? ");
                double gpa = in.nextDouble();

                Student student = new Student(cnt+1,name,surname,gpa);
                students[cnt] = student;
                cnt++;
            }else if (choice==2){
                if (cnt>0){
                    for (int i=0;i<cnt;i++){
                        System.out.println(students[i].getStudentData());
                    }
                }
            }else {
                break;
            }

        }




//        Student []students = {
//                new Student(1,"Nemo","Fuji", 4.0),
//                new Student(2,"Nemo2","Fuji", 2.0),
//                new Student(3,"Nemo3","Fuji", 3.0),
//                new Student(4,"Nemo4","Fuji", 6.0),
//                new Student(5,"Nemo5","Fuji", 9.0),
//                new Student(6,"Nemo6","Fuji", 1.0),
//                new Student(7,"Nemo7","Fuji", 4.9)
//        };
//
//        System.out.println(topStudent(students).getStudentData());

    }

    public static Student topStudent(Student []students){

        Student topStudent = students[0];
        for (int i=0;i<students.length;i++){
            if (students[i].gpa > topStudent.gpa){
                topStudent = students[i];
            }
        }

        return topStudent;
    }
}
