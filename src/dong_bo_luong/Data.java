package dong_bo_luong;

public class Data {
    private int number;
    private int control = 1; // luong co control = 1 se duoc chay truoc


    public Data() {
    }

    public Data(int number, int control) {
        this.number = number;
        this.control = control;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }
}
