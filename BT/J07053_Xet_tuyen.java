package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Employee_J07053 {
    String code;
    String name;
    int age;
    double lt;
    double th;
    double extra;
    double sum;
    String rank;

    public Employee_J07053() {
        this.code = null;
        this.name = null;
        this.age = 0;
        this.lt = 0;
        this.th = 0;
        this.extra = 0;
        this.sum = 0;
        this.rank = null;
    }

    public Employee_J07053(int stt, String name, int age, double lt, double th) {
        this.code = "PH";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.age = age;
        this.lt = lt;
        this.th = th;
        if(this.lt >= 8 && this.th >= 8) {
            this.extra = 1;
        }
        else if(this.lt >= 7.5  && this.th >= 7.5) {
            this.extra = 0.5;
        }
        else {
            this.extra = 0;
        }
        this.sum = (this.lt + this.th) / 2 + this.extra;
        if(this.sum >= 10) {
            this.sum = 10;
        }
        this.sum = Math.round(this.sum);
        if(this.sum < 5) {
            this.rank = "Truot";
        }
        else if(this.sum <= 6) {
            this.rank = "Trung binh";
        }
        else if(this.sum == 7) {
            this.rank = "Kha";
        }
        else if(this.sum == 8) {
            this.rank = "Gioi";
        }
        else {
            this.rank = "Xuat sac";
        }
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.age + " " + Math.round(this.sum) + " " + this.rank;
    }
}

public class J07053_Xet_tuyen {
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
        Scanner scanner = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Employee_J07053[] a = new Employee_J07053[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            name = normalization(name);
            String[] birth = scanner.nextLine().split("/");
            int age = 2021 - Integer.parseInt(birth[2]);
            double lt = Double.parseDouble(scanner.nextLine());
            double th = Double.parseDouble(scanner.nextLine());
            a[i] = new Employee_J07053(i + 1, name, age, lt, th);
        }
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}