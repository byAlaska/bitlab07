package bitlab.askar.module2.ThreadLesson;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {

            for (int i=0;i<10;i++){
                synchronized (this){
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                System.out.println("HEllo there : " + i);
                Thread.sleep(500);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
