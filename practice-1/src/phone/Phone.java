package phone;

import phone.IPhone;

import java.util.Scanner;

public class Phone implements IPhone {
    public String code; //mã điện thoại
    public String name; //tên loại điện thoại
    public double price; //giá điện thoại
    public int weight; //trọng lượng

    public Phone() {
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

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao Ma dien thoai: ");
        this.code = sc.nextLine();
        System.out.println("Nhap vao Ten loai dien thoai: ");
        this.name = sc.nextLine();
        System.out.println("Nhap vao Gia dien thoai: ");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap vao Trong luong: ");
        this.weight = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println("Ma dien thoai:" + code);
        System.out.println("Ten loai dien thoai: " + name);
        System.out.println("Gia dien thoai: " + price);
        System.out.println("Trong luong: " + weight);
    }
}
