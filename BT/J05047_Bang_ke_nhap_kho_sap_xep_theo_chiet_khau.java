package BT;

import java.util.*;

class Product_J05047 implements Comparable<Product_J05047> {
    private String code, name;
    private int soLuong, donGia, chietKhau, thanhTien;

    public Product_J05047(String code, String name, int soLuong, int donGia) {
        this.code = code;
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        if (this.soLuong > 10) {
            this.chietKhau = this.soLuong * this.donGia * 5 / 100;
        } else if (this.soLuong >= 8) {
            this.chietKhau = this.soLuong * this.donGia * 2 / 100;
        } else if (this.soLuong >= 5) {
            this.chietKhau = this.soLuong * this.donGia / 100;
        } else {
            this.chietKhau = 0;
        }
        this.thanhTien = this.soLuong * this.donGia - this.chietKhau;
    }

    @Override
    public int compareTo(Product_J05047 a) {
        return -(this.chietKhau - a.chietKhau);
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.chietKhau + " " + this.thanhTien;
    }
}

public class J05047_Bang_ke_nhap_kho_sap_xep_theo_chiet_khau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05047> a = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] tmp = name.toUpperCase().split(" ");
            String code = "";
            for(int j = 0; j < 2; j++) {
                code += tmp[j].charAt(0);
            }
            if(map.containsKey(code)) {
                map.put(code, map.get(code) + 1);
            }
            else {
                map.put(code, 1);
            }
            code = code + "0" + map.get(code);
            int soLuong = Integer.parseInt(scanner.nextLine());
            int donGia = Integer.parseInt(scanner.nextLine());
            a.add(new Product_J05047(code, name, soLuong, donGia));
        }
        Collections.sort(a);
        for(Product_J05047 i: a) {
            System.out.println(i);
        }
    }
}
