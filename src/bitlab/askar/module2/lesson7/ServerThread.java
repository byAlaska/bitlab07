package bitlab.askar.module2.lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread{

    Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        Scanner in = new Scanner(System.in);
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            while (true){
                String s = (String)inputStream.readObject();
                System.out.println(s);
                if (s.equals("bye")){
                    outputStream.writeObject("bye bye");
                    inputStream.close();
                    outputStream.close();
                    break;
                }

                outputStream.writeObject(in.next());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
