package dong_bo_bai_tap;

import java.util.Random;

public class Luong1 extends Thread{
    private String[] listNames = {"Cuong","Tien","Nam","Binh","Lan","Ngoc","Anh","Duc"};

    private Data data;

    public Luong1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true){
            synchronized (data){
                if(data.getControl()==1){
                    data.setIndex(r.nextInt(0, listNames.length));
                    System.out.println("Luong 1: "+listNames[data.getIndex()]);

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
