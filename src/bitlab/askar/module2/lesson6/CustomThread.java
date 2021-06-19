package bitlab.askar.module2.lesson6;

public class CustomThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                System.out.println("Hello + custom thread");
                Thread.sleep(2000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
