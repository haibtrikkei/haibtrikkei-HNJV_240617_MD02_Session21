package dong_bo_bai_tap;

public class Data {
    private int index;
    private int control = 1;

    public Data() {
    }

    public Data(int index, int control) {
        this.index = index;
        this.control = control;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }
}
