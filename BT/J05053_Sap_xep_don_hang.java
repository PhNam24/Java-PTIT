package BT;

import java.lang.reflect.ParameterizedType;
import java.util.*;

class Product_J05053  implements Comparable<Product_J05053> {
    private String name, code, type, stt;
    private int donGia, soLuong, giamGia, thanhTien;

    public Product_J05053(String name, String code, int donGia, int soLuong) {
        this.name = name;
        this.code = code;
        this.stt = this.code.substring(1, 4);
        this.type = this.code.substring(4);
        this.donGia = donGia;
        this.soLuong = soLuong;
        if(this.type.equals("1")) {
            this.giamGia = this.donGia * this.soLuong / 2;
        }
        else {
            this.giamGia = this.donGia * this.soLuong * 30 / 100;
        }
        this.thanhTien = this.donGia * this.soLuong - this.giamGia;
    }

    @Override
    public int compareTo(Product_J05053 a) {
        return this.stt.compareTo(a.stt);
    }
    @Override
    public String toString() {
        return this.name + " " + this.code + " " + this.stt + " " + this.giamGia + " " + this.thanhTien;
    }
}
public class J05053_Sap_xep_don_hang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05053> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String code = scanner.nextLine();
            int donGia = Integer.parseInt(scanner.nextLine());
            int soLuong = Integer.parseInt(scanner.nextLine());
            a.add(new Product_J05053(name, code, donGia, soLuong));
        }
        Collections.sort(a);
        for(Product_J05053 i: a) {
            System.out.println(i);
        }
    }
}
