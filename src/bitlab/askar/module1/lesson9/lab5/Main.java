package bitlab.askar.module1.lesson9.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        User []users = new User[10];
        int cnt = 0;

        while (true){
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");

            //выбираем добавлять или выводить
            int choice1 = in.nextInt();

            if (choice1==1){

                System.out.println("PRESS [1] TO ADD STUDENT\n" + "PRESS [2] TO ADD STAFF");

                int choice2 = in.nextInt();

                System.out.println("Enter login");
                String login = in.next();
                System.out.println("Enter password");
                String password = in.next();
                System.out.println("Enter name");
                String name = in.next();
                System.out.println("Enter surname");
                String surname = in.next();

                User user = new User();

                //второй выбор: ДОБАВЯЕМ Студента ИЛИ Стаффа
                if (choice2==1){

                    System.out.println("Enter gpa");
                    double gpa = in.nextDouble();

                    //создаем студента
                    user = new Student(cnt+1, login, password, name, surname, gpa);

                    //добавляем студенту предметы
                    while (true) {
                        System.out.println("[1] TO ADD COURSE");
                        System.out.println("[0] TO STOP ADDING COURSE");

                        int choice3 = in.nextInt();

                        if (choice3==1){
                            System.out.println("Course name: ");
                            String course = in.next();
                            ((Student)user).addCourse(course);
                        }else {
                            break;
                        }
                    }

                }else if (choice2==2){

                    System.out.println("Enter salary");
                    double salary = in.nextDouble();

                    //создаем стаффа
                    user = new Staff(cnt+1, login, password, name, surname, salary);

                    //добавляем предметы стаффу
                    while (true) {
                        System.out.println("[1] TO ADD Subject");
                        System.out.println("[0] TO STOP ADDING subject");

                        int choice3 = in.nextInt();

                        if (choice3==1){
                            System.out.println("Subject name: ");
                            String subject = in.next();
                            ((Staff) user).addSubject(subject);
                        }else {
                            break;
                        }
                    }

                }

                //добавляем созданного нами объекта (студента или стаффа) в массив юзеров
                users[cnt] = user;
                cnt++;

            }else if (choice1==2) {

                //выводим юзеров по выбор
                System.out.println("\n" +
                        "PRESS [1] TO LIST STUDENTS\n" +
                        "PRESS [2] TO LIST STAFF");

                //выбираем каких юзеров выводить (студентов или стаффов)
                int choice2 = in.nextInt();

                for (int i=0;i<cnt;i++){

                    if (choice2==1){
                        //проверяем объект массив на Студента
                        if (users[i] instanceof Student){
                            System.out.println(users[i]);
                        }
                    }else {
                        //проверяем объект массив на Стаффа
                        if (users[i] instanceof Staff){
                            System.out.println(users[i]);
                        }
                    }
                }

            }else {
                break;
            }
        }

    }
}