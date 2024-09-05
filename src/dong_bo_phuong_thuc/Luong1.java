package dong_bo_phuong_thuc;

public class Luong1 extends Thread{
    ClassDongBo dongbo;

    public Luong1(ClassDongBo dongbo) {
        this.dongbo = dongbo;
    }

    @Override
    public void run() {
        dongbo.hello("Nguyen Van Binh");
    }
}
