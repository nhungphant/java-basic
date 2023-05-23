package chapter09;

public class HCNTest {
    public static void main(String[] args) {
        int n = 5;
        HCN[] HCNarray = new HCN[n];
        HCN h0 = new HCN();
        h0.setDaiRong(9.0, 3.0);
        HCNarray[0] = h0;
        HCN h1 = new HCN();
        h1.setDaiRong(8.67, 4.23);
        HCNarray[1] = h1;
        HCN h2 = new HCN();
        h2.setDaiRong(5.9, 2.8);
        HCNarray[2] = h2;
        HCN h3 = new HCN();
        h3.setDaiRong(7.8, 5.5);
        HCNarray[3] = h3;
        HCN h4 = new HCN();
        h4.setDaiRong(7.43, 4.65);
        HCNarray[4] = h4;

//        System.out.println(HCNarray.toString());

        int count = 1;
        for (HCN hcn : HCNarray) {
            System.out.println("Hinh " + count + ": Chieu dai = " + hcn.getChieuDai()
                    + ", Chieu rong = " + hcn.getChieuRong() + ", Dien tich = " + hcn.dientichHCN());
            count++;
        }

        double maxDienTich = h0.dientichHCN();
        HCN hmax = new HCN();
        for (HCN hcn : HCNarray) {
            if (hcn.dientichHCN() > maxDienTich) {
                maxDienTich = hcn.dientichHCN();
                hmax = hcn;
            }
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat: Chieu dai = " + hmax.getChieuDai()
                + ", Chieu rong = " + hmax.getChieuRong() + ", Dien tich = " + maxDienTich);
    }
}
