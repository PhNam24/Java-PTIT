package TH.TH2;

import java.util.*;
import java.io.*;

class Product_I {
    private String ma, ten;
    private long gia;
    private int baoHanh;

    public Product_I(String ma, String ten, long gia, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    public String getMa() {
        return this.ma;
    }

    public long getGia() {
        return this.gia;
    }

    public int getBaoHanh() {
        return this.baoHanh;
    }
}

class Customer_I implements Comparable<Customer_I> {
    private String maKH, ten, diaChi, maSP, ngayMua, ngayHetBH;
    private int soLuong;
    private long tong;

    public Customer_I(int stt, String ten, String diaChi, String maSP, int soLuong, String ngayMua) {
        this.maKH = "KH";
        if(stt < 10) {
            maKH += "0" + stt;
        }
        else {
            maKH += stt;
        }
        this.ten = ten;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
    }

    public void setNgayHetBH(String ngayHetBH) {
        this.ngayHetBH = ngayHetBH;
    }

    public void setTong(long tong) {
        this.tong = tong;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public String getNgayMua() {
        return this.ngayMua;
    }

    @Override
    public int compareTo(Customer_I a) {
        String[] tmp1 = this.ngayHetBH.split("/");
        String[] tmp2 = a.ngayHetBH.split("/");
        int d1 = Integer.parseInt(tmp1[0]), m1 = Integer.parseInt(tmp1[1]), y1 = Integer.parseInt(tmp1[2]);
        int d2 = Integer.parseInt(tmp2[0]), m2 = Integer.parseInt(tmp2[1]), y2 = Integer.parseInt(tmp2[2]);
        if(y1 != y2) {
            return y1 - y2;
        }
        else if(m1 != m2) {
            return m1 - m2;
        }
        else if(d1 != d2) {
            return d1 - d2;
        }
        return this.maKH.compareTo(a.maKH);
    }

    public String toString() {
        return this.maKH + " " + this.ten + " " + this.diaChi + " " + this.maSP + " " + this.tong + " " + this.ngayHetBH;
    }
}

public class I_Bao_hanh_san_pham {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("TH/TH2/InputFile/MUAHANG.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_I> b = new ArrayList<>();
        ArrayList<Customer_I> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            int gia = Integer.parseInt(scanner.nextLine());
            int baoHanh = Integer.parseInt(scanner.nextLine());
            b.add(new Product_I(ma, ten, gia, baoHanh));
        }
        n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            String ten = scanner.nextLine();
            String diaChi = scanner.nextLine();
            String maSP = scanner.nextLine();
            int soLuong = Integer.parseInt(scanner.nextLine());
            String ngayMua = scanner.nextLine();
            a.add(new Customer_I(i + 1, ten, diaChi, maSP, soLuong, ngayMua));
            for(Product_I j: b) {
                if(j.getMa().equals(maSP)) {
                    long gia = j.getGia();
                    a.get(i).setTong(gia * a.get(i).getSoLuong());
                    int baoHanh = j.getBaoHanh();
                    String[] tmp1 = ngayMua.split("/");
                    int d = Integer.parseInt(tmp1[0]), m = Integer.parseInt(tmp1[1]), y = Integer.parseInt(tmp1[2]);
                    int y1 = baoHanh / 12;
                    int m1 = baoHanh % 12;
                    if(m + m1 > 12) {
                        y1 += 1;
                    }
                    m = (m + m1) % 12;
                    if(m == 0) {
                        m = 12;
                    }
                    y += y1;
                    String ngayHetBH = String.format("%02d/%02d/%04d", d, m, y);
                    a.get(i).setNgayHetBH(ngayHetBH);
                }
            }
        }
        Collections.sort(a);
        for(Customer_I i: a) {
            System.out.println(i);
        }
    }
}
