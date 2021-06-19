package bitlab.askar.module2.lesson7;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        try {

            ServerSocket server = new ServerSocket(2077);

            while (true){
                Socket socket = server.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                System.out.println("Client connected");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
