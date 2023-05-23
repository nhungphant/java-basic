package phone.nokia;

import java.util.Scanner;

public class Nokia extends phone.Phone {
    int warranty; //thời gian bảo hành

    public Nokia() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhap vao Thoi gian bao hanh: ");
        this.warranty = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thoi gian bao hanh: " + warranty);
    }
}
