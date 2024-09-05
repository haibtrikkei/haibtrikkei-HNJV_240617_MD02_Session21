package dong_bo_luong;

public class Luong2 extends Thread{
    private Data data;

    public Luong2(Data data) {
        this.data = data;
    }

    @Override
    public void  run() {
        while (true){
            synchronized (data){
                if(data.getControl()==2){
                    int n = data.getNumber();
                    if(n%2==0){
                        System.out.println("Luong 2: "+n+" la so chan");
                    }else{
                        System.out.println("Luong 2: "+n+" la so le");
                    }

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
