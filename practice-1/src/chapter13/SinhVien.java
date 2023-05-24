package chapter13;

public class SinhVien {
    String maSinhVien, hoTen, xepLoai;
    int diem;

    public SinhVien(String maSinhVien, String hoTen, int diem) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diem = diem;
        if (this.diem >= 8) {
            xepLoai = "Gioi";
        } else if (this.diem >= 7) {
            xepLoai = "Kha";
        } else if (this.diem >= 5) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Kem";
        }
    }

    public SinhVien() {

    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
