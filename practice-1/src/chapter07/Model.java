package chapter07;

public enum Model {
    ONE(1),
    TWO(2),
    THREE(3);

    private int modelNum;

    private Model (int modelNum) {
        this.modelNum = modelNum;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }
}