package dong_bo_luong;

public class ChayChuongTrinh {
    public static void main(String[] args) {
        Data dt = new Data();

        Luong1 luong1 = new Luong1(dt);
        Luong2 luong2 = new Luong2(dt);

        luong2.start();
        luong1.start();
    }
}
