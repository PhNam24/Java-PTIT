package BT;

import java.io.*;
import java.util.*;

class Product_J07050 implements Comparable<Product_J07050> {
    String code;
    String name;
    String group;
    double buy;
    double sell;

    double profit;

    public Product_J07050() {
        this.code = null;
        this.name = null;
        this.group = null;
        this.buy = 0;
        this.sell = 0;
        this.profit = 0;
    }

    public Product_J07050(int stt, String name, String group, double buy, double sell) {
        this.code = "MH";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.group = group;
        this.buy = buy;
        this.sell = sell;
        this.profit = this.sell - this.buy;
    }

    @Override
    public int compareTo(Product_J07050 Product_J07050) {
        if(this.profit != Product_J07050.profit) {
            if(this.profit - Product_J07050.profit > 0) {
                return  -1;
            }
            else {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format(this.code + " " + this.name + " " + this.group + " " + String.format("%.2f", this.profit));
    }

}

public class J07050_Sap_xep_mat_hang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Product_J07050[] a = new Product_J07050[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();;
            String group = scanner.nextLine();
            double buy = Double.parseDouble(scanner.nextLine());
            double sell = Double.parseDouble(scanner.nextLine());
            a[i] = new Product_J07050(i + 1, name, group, buy, sell);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}