package tao_luong_theo_runnable;

public class ChayThu {
    public static void main(String[] args) {
        Luong1 luong1 = new Luong1();
        Luong2 luong2 = new Luong2();

        Thread t1 = new Thread(luong1);
        Thread t2 = new Thread(luong2);

//        luong1.run();
//        luong2.run();
        t1.start();
        t2.start();
    }
}
