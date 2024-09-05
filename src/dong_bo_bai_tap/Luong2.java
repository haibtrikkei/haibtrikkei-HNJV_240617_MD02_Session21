package dong_bo_bai_tap;

public class Luong2 extends Thread{
    private String[] listAddress = {"Thai Nguyen","Ha Noi","Nam Dinh","Binh Duong","Hai Phong","Nghe An","THai Binh","Hoai Duc"};

    private Data data;

    public Luong2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true){
            synchronized (data){
                if(data.getControl()==2){
                    System.out.println("Luong 2: "+listAddress[data.getIndex()]);

                    data.setControl(1);
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
