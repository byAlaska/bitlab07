package bitlab.askar.module2.ThreadLesson;

public class Main {
    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("group1");

        MyThread thread = new MyThread(group,"First thread");
        MyThread thread2 = new MyThread(group,"First thread");
        MyThread thread3 = new MyThread(group,"First thread");

        thread.start();
        thread2.start();
        thread3.start();

        while (true){
            if (group.activeCount()==0){
                break;
            }
        }

        SecondThread secondThread = new SecondThread();
        secondThread.run();


        System.out.println("Main said hello");

    }
}
