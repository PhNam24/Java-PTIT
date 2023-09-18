package BT;

import java.io.*;
import java.util.*;

class Product_J07048 implements Comparable<Product_J07048> {
    String code;
    String name;
    int price;
    int guarantee;
    public Product_J07048() {
        this.code = null;
        this.name = null;
        this.price = 0;
        this.guarantee = 0;
    }

    public Product_J07048(String code, String name, int price, int guarantee) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.guarantee = guarantee;
    }

    @Override
    public int compareTo(Product_J07048 Product_J07048) {
        if(this.price != Product_J07048.price) {
            return -(this.price - Product_J07048.price);
        }
        return this.code.compareTo(Product_J07048.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.price + " " + this.guarantee;
    }
}

public class J07048_Danh_sach_san_pham_2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Product_J07048[] a = new Product_J07048[n];
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int price = Integer.parseInt(scanner.nextLine());
            int guarantee = Integer.parseInt(scanner.nextLine());
            a[i] = new Product_J07048(code, name, price, guarantee);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}