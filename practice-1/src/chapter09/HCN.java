package chapter09;

public class HCN implements HCNInterface {
    double chieuDai, chieuRong;

    public HCN() {
    }

    @Override
    public double dientichHCN() {
        return chieuDai*chieuRong;
    }

    @Override
    public double getChieuDai() {
        return chieuDai;
    }

    @Override
    public double getChieuRong() {
        return chieuRong;
    }

    @Override
    public void setDaiRong(double cd, double cr) {
        this.chieuDai = cd;
        this.chieuRong = cr;
    }
}
