package dong_bo_luong;

import java.util.Random;

public class Luong1 extends Thread{
    private Data data;

    public Luong1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Random r = new Random();
        while(true){
            synchronized (data){
                if(data.getControl()==1){
                    data.setNumber(r.nextInt(1,50));
                    System.out.println("Luong 1: "+data.getNumber());

                    data.setControl(2);
                    data.notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
