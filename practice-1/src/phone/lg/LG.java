package phone.lg;

import java.util.Scanner;

import phone.Phone;

public class LG extends Phone {
    Integer warranty; //thời gian bảo hành

    public LG() {
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

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
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
