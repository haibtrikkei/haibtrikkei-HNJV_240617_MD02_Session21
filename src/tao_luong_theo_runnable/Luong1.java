package tao_luong_theo_runnable;

import java.util.Random;

public class Luong1 implements Runnable{
    @Override
    public void run() {
        Random r = new Random();
        while(true){
            System.out.println("Luong 1: "+r.nextInt(1,101));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
