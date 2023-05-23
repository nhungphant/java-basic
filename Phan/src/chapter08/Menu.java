package chapter08;

public enum Menu {
    //enum gồm 2 biến
    ONE(1, "Gui tien vao tai khoan"),
    TWO(2, "Rut tien tu tai khoan"),
    THREE(3, "Hien thi so du hien co"),
    FOUR(4, "Thoat");
    private int buttonNum;
    private String buttonContent;

    private Menu(int buttonNum, String buttonContent) {
        this.buttonNum = buttonNum;
        this.buttonContent = buttonContent;
    }

    public int getButtonNum() {
        return buttonNum;
    }

    public void setButtonNum() {
        this.buttonNum = buttonNum;
    }

    public String getButtonContent() {
        return buttonContent;
    }

    public void setButtonContent() {
        this.buttonContent = buttonContent;
    }
}

