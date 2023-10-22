package BT;

import java.util.*;

class Product_J05076 {
    private String code, name, type;
    private long nhap, xuat, giaNhap, tienNhap, tienXuat;

    public Product_J05076 (String code, String name, String type) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.nhap = 0;
        this.xuat = 0;
        this.giaNhap = 0;
        this.tienNhap = 0;
        this.tienXuat = 0;
    }

    public Product_J05076 (String code, String name, String type, long nhap, long giaNhap, long xuat) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.nhap = nhap;
        this.giaNhap = giaNhap;
        this.xuat = xuat;
        this.tienNhap = this.nhap * this.giaNhap;
        this.tienXuat = this.xuat * this.giaNhap;
        if(this.type.equals("A")) {
            this.tienXuat += this.tienXuat * 8 / 100;
        }
        else if(this.type.equals("B")) {
            this.tienXuat += this.tienXuat * 5 / 100;
        }
        else {
            this.tienXuat += this.tienXuat * 2 / 100;
        }
    }

    public String getCode() {
        return this.code;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.tienNhap + " " + this.tienXuat;
    }
}
public class J05076_Nhap_xuat_hang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05076> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String type = scanner.nextLine();
            a.add(new Product_J05076(code, name, type));
        }
        ArrayList<Product_J05076> b = new ArrayList<>();
        int q = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < q; i++) {
            String[] tmp = scanner.nextLine().split(" ");
            for(Product_J05076 j: a) {
                if(j.getCode().equals(tmp[0])) {
                    b.add(new Product_J05076(tmp[0], j.getName(), j.getType(), Long.parseLong(tmp[1]), Long.parseLong(tmp[2]),Long.parseLong(tmp[3])));
                }
            }
        }
        for(Product_J05076 i: b) {
            System.out.println(i);
        }
    }
}
