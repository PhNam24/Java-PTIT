package BT;

import java.util.Scanner;

class PhanSo_J04004 {
    private long tu, mau;
    public PhanSo_J04004() {
        this.tu = 0;
        this.mau = 0;
    }
    public PhanSo_J04004(long tu, long mau) {
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

    public PhanSo_J04004 add(PhanSo_J04004 ps) {
        long a = this.mau;
        long b = ps.mau;
        while (a != 0) {
            long x = a;
            a = b % a;
            b = x;
        }
        long lcm = this.mau * ps.mau / b;
        PhanSo_J04004 c = new PhanSo_J04004();
        c.tu = this.tu * (lcm / this.mau) + ps.tu * (lcm / ps.mau);
        c.mau = lcm;
        return c;
    }
    public void in() {
        System.out.printf("%d/%d", this.tu, this.mau);
    }
}
public class J04004_Tong_phan_so {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long a1 = scanner.nextLong();
        long b1 = scanner.nextLong();
        long a2 = scanner.nextLong();
        long b2 = scanner.nextLong();
        PhanSo_J04004 a = new PhanSo_J04004(a1, b1);
        PhanSo_J04004 b = new PhanSo_J04004(a2, b2);
        PhanSo_J04004 ps = a.add(b);
        ps.rutGon();
        ps.in();
    }
}
