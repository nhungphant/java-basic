package chapter08;

public class Account {
    double dAmount; //số dư trong tài khoản
    double bBalance; //số tiền còn lại - sau khi rút tiền

    public Account() {
    }

    public double getdAmount() {
        return dAmount;
    }

    public void setdAmount(double dAmount) {
        this.dAmount = dAmount;
    }

    public double getbBalance() {
        return bBalance;
    }

    public void setbBalance(double bBalance) {
        this.bBalance = bBalance;
    }

    //gửi số tiền là dDepAmount
    public double deposit(double dDepAmount) {
        return dAmount += dDepAmount;
    }

    //rút số tiền là dWdrAmount
    public double withdraw(double dWdrAmount) {
        return bBalance -= dWdrAmount;
    }
}
