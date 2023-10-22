package BT;

import java.io.File;
import java.util.*;
class Product_J05010 implements Comparable<Product_J05010> {
    private int code;
    private String name;
    private String group;
    private double buy;
    private double sell;

    private double profit;

    public Product_J05010() {
        this.code = 0;
        this.name = null;
        this.group = null;
        this.buy = 0;
        this.sell = 0;
        this.profit = 0;
    }

    public Product_J05010(int stt, String name, String group, double buy, double sell) {
        this.code = stt;
        this.name = name;
        this.group = group;
        this.buy = buy;
        this.sell = sell;
        this.profit = this.sell - this.buy;
    }

    @Override
    public int compareTo(Product_J05010 Product_J05010) {
        if(this.profit != Product_J05010.profit) {
            if(this.profit - Product_J05010.profit > 0) {
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
public class J05010_Sap_xep_danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Product_J05010> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();;
            String group = scanner.nextLine();
            double buy = Double.parseDouble(scanner.nextLine());
            double sell = Double.parseDouble(scanner.nextLine());
            a.add(new Product_J05010(i + 1, name, group, buy, sell));
        }
        Collections.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
