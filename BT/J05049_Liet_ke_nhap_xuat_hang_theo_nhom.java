package BT;

import java.util.*;
class Product_J05049 implements Comparable<Product_J05049> {
    private String code;
    private long nhap, xuat, donGia, tien, thue;
    public Product_J05049(String code, long nhap) {
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

    public String getCode() {
        return this.code;
    }

    @Override
    public int compareTo(Product_J05049 a) {
        return -(int)(this.thue - a.thue);
    }
    @Override
    public String toString() {
        return this.code + " " + this.nhap + " " + this.xuat + " " + this.donGia + " " + this.tien + " " + this.thue;
    }
}
public class J05049_Liet_ke_nhap_xuat_hang_theo_nhom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05049> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            long nhap = Long.parseLong(scanner.nextLine());
            a.add(new Product_J05049(code, nhap));
        }
        Collections.sort(a);
        char[] query = scanner.nextLine().toCharArray();
        for(Product_J05049 i: a) {
            if(i.getCode().charAt(0) == query[0]) {
                System.out.println(i);
            }
        }
    }
}

