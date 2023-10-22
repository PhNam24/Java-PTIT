package BT;

import java.util.*;

class Product_J05036 {
    private String code, name, unit;
    private int giaNhap, soLuong;
    private double vanChuyen, thanhTien, giaBan;

    public Product_J05036(int stt, String name, String unit, int giaNhap, int soLuong) {
        this.code = "MH";
        if(stt < 10) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.name = name;
        this.unit = unit;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.vanChuyen = (double)(this.giaNhap * this.soLuong * 5) / 100;
        this.thanhTien = this.giaNhap * this.soLuong + this.vanChuyen;
        this.giaBan = this.thanhTien + thanhTien * 2 / 100;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.unit + " " + Math.round(this.vanChuyen) + " " + Math.round(this.thanhTien) + " " + Math.round(this.giaBan);
    }
}
public class J05036_Tinh_gia_ban_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05036> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String unit= scanner.nextLine();
            int giaNhap = Integer.parseInt(scanner.nextLine());
            int soLuong = Integer.parseInt(scanner.nextLine());
            a.add(new Product_J05036(i + 1, name, unit, giaNhap, soLuong));
        }
        for(Product_J05036 i: a) {
            System.out.println(i);
        }
    }
}
