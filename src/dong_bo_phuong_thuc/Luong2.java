package dong_bo_phuong_thuc;

public class Luong2 extends Thread{
    ClassDongBo dongbo;

    public Luong2(ClassDongBo dongbo) {
        this.dongbo = dongbo;
    }

    @Override
    public void run() {
        dongbo.hello("Tran Van Nam");
    }
}
