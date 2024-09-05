package tao_luong;

public class Luong1 extends Thread{
    @Override
    public void run() {
         while(true){
             System.out.println("Xu ly cong viec 1!!!!");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
    }
}
