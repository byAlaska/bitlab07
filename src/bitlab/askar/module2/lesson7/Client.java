package bitlab.askar.module2.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {

            Socket socket = new Socket("127.0.0.1", 2077);

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true){
                outputStream.writeObject(in.next());
                String s = (String) inputStream.readObject();
                System.out.println(s);
                if (s.equals("bye bye")){
                    outputStream.close();
                    inputStream.close();
                    break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
