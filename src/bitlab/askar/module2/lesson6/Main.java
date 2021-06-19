package bitlab.askar.module2.lesson6;

import bitlab.askar.module2.lesson5.lab2.Game;

public class Main {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("Group");

        Game game = new Game();

        MyThread thread = new MyThread(threadGroup,"Thread ONE");
        MyThread thread2 = new MyThread(threadGroup,"Thread TWO");
        MyThread thread3 = new MyThread(threadGroup, "Thread ThREE");
        thread.start();
        thread2.start();
        thread3.start();

        while (threadGroup.activeCount()>0){

        }

        System.out.println("Finished");

    }

}
