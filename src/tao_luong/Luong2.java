package tao_luong;

public class Luong2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Xu ly cong viec 2!!!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
