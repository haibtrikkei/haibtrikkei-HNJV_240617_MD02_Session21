package tao_luong_theo_runnable;

import java.util.Calendar;

public class Luong2 implements Runnable{
    @Override
    public void run() {
        while (true){
            Calendar cl = Calendar.getInstance();
            System.out.println("Luong 2: "+cl.get(Calendar.HOUR)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
