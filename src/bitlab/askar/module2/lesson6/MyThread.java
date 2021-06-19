package bitlab.askar.module2.lesson6;

import bitlab.askar.module2.lesson5.lab2.Game;

public class MyThread extends Thread {

    Game game;

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {

            System.out.println("started");
            for (int i=0;i<10;i++){
                Thread.sleep(1000);
                System.out.println("");
            }
            System.out.println("finished");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
