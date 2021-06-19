package bitlab.askar.module1.lesson9.lab5;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public Student(int id, String login, String password, String name, String surname, double gpa, String[] courses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public int getCoureSize() {
        return indexOfCourses;
    }

    @Override
    public String toString() {

        String coursesString = "";
        for (int i=0;i<indexOfCourses;i++) {
            coursesString += courses[i] + ", ";
        }

        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + coursesString +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
