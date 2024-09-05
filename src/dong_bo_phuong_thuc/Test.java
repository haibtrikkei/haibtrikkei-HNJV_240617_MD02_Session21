package dong_bo_phuong_thuc;

public class Test {
    public static void main(String[] args) {
        ClassDongBo dongbo = new ClassDongBo();

        Luong1 luong1 = new Luong1(dongbo);
        Luong2 luong2 = new Luong2(dongbo);
        Luong3 luong3 = new Luong3(dongbo);

        luong1.start();
        luong2.start();
        luong3.start();
    }
}
