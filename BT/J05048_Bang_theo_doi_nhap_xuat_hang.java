package BT;

import java.util.*;

class Product_J05048 {
    private String code;
    private long nhap, xuat, donGia, tien, thue;
    public Product_J05048(String code, long nhap) {
        this.code = code;
        this.nhap = nhap;
        int len = this.code.length();
        if(this.code.charAt(0) == 'A') {
            this.xuat = Math.round(this.nhap * 0.6);
        }
        else {
            this.xuat = Math.round(this.nhap * 0.7);
        }
        if(this.code.charAt(len - 1) == 'Y') {
            this.donGia = 110000;
        }
        else {
            this.donGia = 135000;
        }
        this.tien = this.donGia * this.xuat;
        if(this.code.charAt(0) == 'A') {
            if(this.code.charAt(len - 1) == 'Y') {
                this.thue = this.tien * 8 /100;
            }
            else {
                this.thue = this.tien * 11 / 100;
            }
        }
        else {
            if(this.code.charAt(len - 1) == 'Y') {
                this.thue = this.tien * 17 /100;
            }
            else {
                this.thue = this.tien * 22 / 100;
            }
        }
    }
    @Override
    public String toString() {
         return this.code + " " + this.nhap + " " + this.xuat + " " + this.donGia + " " + this.tien + " " + this.thue;
    }
}
public class J05048_Bang_theo_doi_nhap_xuat_hang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05048> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            long nhap = Long.parseLong(scanner.nextLine());
            a.add(new Product_J05048(code, nhap));
        }
        for(Product_J05048 i: a) {
            System.out.println(i);
        }
    }
}
