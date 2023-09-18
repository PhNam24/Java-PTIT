package BT;

import java.util.Scanner;

class PhanSo_J04003 {
    private long tu, mau;
    public PhanSo_J04003(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void rutGon() {
        long a = this.tu;
        long b = this.mau;
        while (a != 0) {
            long x = a;
            a = b % a;
            b = x;
        }
        this.tu /= b;
        this.mau /= b;
    }

    public void in() {
        System.out.printf("%d/%d", this.tu, this.mau);
    }
}
public class J04003_Phan_so {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        PhanSo_J04003 ps = new PhanSo_J04003(a, b);
        ps.rutGon();
        ps.in();
    }
}
