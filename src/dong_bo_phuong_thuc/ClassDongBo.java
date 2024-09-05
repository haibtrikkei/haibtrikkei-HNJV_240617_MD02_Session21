package dong_bo_phuong_thuc;

public class ClassDongBo {
    public synchronized void hello(String name){
        System.out.println("Chao ban: "+name);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
