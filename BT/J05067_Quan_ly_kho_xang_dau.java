package BT;

import java.util.*;

class Product_J05067 {
    private String code, name;
    private long donGia, soLuong, thue, thanhTien;

    public Product_J05067(String code, long soLuong) {
        this.code = code;
        this.soLuong = soLuong;
        String name = this.code.substring(3);
        if(name.equals("TN")) {
            this.name = "Trong Nuoc";
        }
        else if(name.equals("BP")) {
            this.name = "British Petro";
        }
        else if(name.equals("ES")) {
            this.name = "Esso";
        }
        else if(name.equals("SH")) {
            this.name = "Shell";
        }
        else if(name.equals("CA")) {
            this.name = "Castrol";
        }
        else {
            this.name = "Mobil";
        }
        char type = this.code.charAt(0);
        if(type == 'X') {
            this.donGia = 128000;
            this.thue = this.donGia * this.soLuong * 3 / 100;
        }
        else if(type == 'D') {
            this.donGia = 11200;
            this.thue = this.donGia * this.soLuong * 35 / 1000;
        }
        else {
            this.donGia = 9700;
            this.thue = this.donGia * this.soLuong * 2 / 100;
        }
        if(name.equals("TN")) {
            this.thue = 0;
        }
        this.thanhTien = this.donGia * this.soLuong + this.thue;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.donGia + " " + this.thue + " " + this.thanhTien;
    }
}
public class J05067_Quan_ly_kho_xang_dau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05067> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.next();
            long soLuong = Long.parseLong(scanner.next());
            a.add(new Product_J05067(code, soLuong));
        }
        for(Product_J05067 i: a) {
            System.out.println(i);
        }
    }
}


