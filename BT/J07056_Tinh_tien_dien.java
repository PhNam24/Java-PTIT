package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Custumer_J07056 implements Comparable<Custumer_J07056> {
    String code;
    String name;
    String type;
    int soDien;
    int money;
    int extra;
    int vatTax;
    int sum;
    public Custumer_J07056() {
        this.code = null;
        this.name = null;
        this.type = null;
        this.soDien = 0;
        this.money = 0;
        this.extra = 0;
        this.vatTax = 0;
        this.sum = 0;
    }

    public Custumer_J07056(int stt, String name, String type, int start, int end) {
        this.code = "KH";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.type = type;
        this.soDien = end - start;
        if(this.type.equals("A")) {
            if(this.soDien <= 100) {
                this.money = this.soDien * 450;
                this.extra = 0;
                this.vatTax = 0;
            }
            else {
                this.money = 100 * 450;
                this.extra = (this.soDien - 100) * 1000;
                this.vatTax = this.extra / 20;
            }
        }
        else if(this.type.equals("B")) {
            if(this.soDien <= 500) {
                this.money = this.soDien * 450;
                this.extra = 0;
                this.vatTax = 0;
            }
            else {
                this.money = 500 * 450;
                this.extra = (this.soDien - 500) * 1000;
                this.vatTax = this.extra / 20;
            }
        }
        else if(this.type.equals("C")) {
            if(this.soDien <= 200) {
                this.money = this.soDien * 450;
                this.extra = 0;
                this.vatTax = 0;
            }
            else {
                this.money = 200 * 450;
                this.extra = (this.soDien - 200) * 1000;
                this.vatTax = this.extra / 20;
            }
        }
        this.sum = this.money + this.extra + this.vatTax;
    }

    @Override
    public int compareTo(Custumer_J07056 Custumer_J07056) {
        return -(this.sum - Custumer_J07056.sum);
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.money + " " + this.extra + " " + this.vatTax + " " + this.sum;
    }
}

public class J07056_Tinh_tien_dien {
    public static String normalization(String ss) {
        String[] s = ss.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(int i = 0; i < s.length; i++) {
            ans += s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
            if(i < s.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Custumer_J07056[] a = new Custumer_J07056[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            name = normalization(name);
            String[] tmp = scanner.nextLine().trim().split("\\s+");
            String type = tmp[0];
            int start = Integer.parseInt(tmp[1]);
            int end = Integer.parseInt(tmp[2]);
            a[i] = new Custumer_J07056(i + 1, name, type, start, end);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}