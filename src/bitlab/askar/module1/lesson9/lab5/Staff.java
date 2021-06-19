package bitlab.askar.module1.lesson9.lab5;

import java.util.Arrays;

public class Staff extends User {

    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    //returns size of filled subjects in subjects array
    public int getSubjectsSize() {
        return indexOfSubject;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", subjects=" + Arrays.toString(subjects) +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
