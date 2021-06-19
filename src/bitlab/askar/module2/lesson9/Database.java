package bitlab.askar.module2.lesson9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {

    private Connection connection;

    public void connect(){
        try{
            //Подтягиваем драйвер, который мы добавили в самом начале урока
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Создаем подключение.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bitlab_bd7?useUnicode=true&serverTimezone=UTC","root", ""
            );
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> students = new ArrayList<>();

        try{
            PreparedStatement st = connection.prepareStatement("SELECT * FROM students");
            ResultSet rs = st.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                double gpa = rs.getDouble("engive_volume");

                students.add(new Student(id, name, surname, gpa));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }


    public void addStudent(Student student){
        try{
            PreparedStatement st = connection.prepareStatement("INSERT INTO students(name, surname, gpa) values(?,?,?)");

            st.setString(1,student.getName());
            st.setString(2,student.getSurname());
            st.setDouble(3,student.getGpa());

            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
