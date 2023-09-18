package BT;

import java.util.*;

class PhanSo_J04014 {
    private long tu, mau;
    public PhanSo_J04014() {
        this.tu = 0;
        this.mau = 0;
    }
    public PhanSo_J04014(long tu, long mau) {
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
    public PhanSo_J04014 add(PhanSo_J04014 a) {
        long mau = this.mau * a.mau;
        long tu = this.tu * a.mau + a.tu * this.mau;
        PhanSo_J04014 c = new PhanSo_J04014(tu, mau);
        c.rutGon();
        return c;
    }

    public PhanSo_J04014 multiply(PhanSo_J04014 a) {
        long tu = this.tu * a.tu;
        long mau = this.mau * a.mau;
        PhanSo_J04014 c = new PhanSo_J04014(tu, mau);
        c.rutGon();
        return c;
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
public class J04014_Tinh_toan_phan_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            long tu1 = scanner.nextLong();
            long mau1 = scanner.nextLong();
            long tu2 = scanner.nextLong();
            long mau2 = scanner.nextLong();
            PhanSo_J04014 ps1 = new PhanSo_J04014(tu1, mau1);
            PhanSo_J04014 ps2 = new PhanSo_J04014(tu2, mau2);
            PhanSo_J04014 c = ps1.add(ps2);
            c = c.multiply(c);
            PhanSo_J04014 d = ps1.multiply(ps2).multiply(c);
            System.out.println(c + " " + d);
        }
    }
}
