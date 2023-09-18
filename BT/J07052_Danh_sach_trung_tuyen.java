package BT;

import java.io.*;
import java.text.ParseException;
import java.util.*;

class Student_J07052 implements Comparable<Student_J07052> {
    String code;
    String name;
    double toan;
    double ly;
    double hoa;
    double extra;
    double sum;
    String status;
    public Student_J07052() {
        this.code = null;
        this.name = null;
        this.toan = 0;
        this.ly = 0;
        this.hoa = 0;
        this.extra = 0;
        this.sum = 0;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getExtra() {
        if(this.extra == (int)this.extra) {
            return String.valueOf((int)this.extra);
        }
        return String.format("%.1f", this.extra);
    }

    public String getSum() {
        if(this.sum == (int)this.sum) {
            return String.valueOf((int)this.sum);
        }
        return String.format("%.1f", this.sum);
    }
    public Student_J07052(String code, String name, double toan, double ly, double hoa) {
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(this.code.substring(0, 3).equals("KV1")) {
            this.extra = 0.5;
        }
        else if(this.code.substring(0, 3).equals("KV2")) {
            this.extra = 1;
        }
        else {
            this.extra = 2.5;
        }
        this.sum = this.toan * 2 + this.ly + this.hoa + this.extra;
    }

    @Override
    public int compareTo(Student_J07052 Student_J07052) {
        if(this.sum != Student_J07052.sum) {
            if(this.sum > Student_J07052.sum) {
                return -1;
            }
            else {
                return 1;
            }
        }
        return this.code.compareTo(Student_J07052.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + getExtra() + " " + getSum() + " " + this.status;
    }
}

public class J07052_Danh_sach_trung_tuyen {
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
        Scanner scanner = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Student_J07052[] a = new Student_J07052[n];
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            name = normalization(name);
            double toan = Double.parseDouble(scanner.nextLine());
            double ly = Double.parseDouble(scanner.nextLine());
            double hoa = Double.parseDouble(scanner.nextLine());
            a[i] = new Student_J07052(code, name, toan, ly, hoa);
        }
        int chiTieu = scanner.nextInt();
        Arrays.sort(a);
        double diemChuan = a[chiTieu - 1].sum;
        if(diemChuan == (int)diemChuan) {
            System.out.println((int)diemChuan);
        }
        else {
            System.out.println(String.format("%.1f", diemChuan));
        }
        for(int i = 0; i < n; i++) {
            if(a[i].sum >= diemChuan) {
                a[i].setStatus("TRUNG TUYEN");
            }
            else {
                a[i].setStatus("TRUOT");
            }
            System.out.println(a[i]);
        }
    }
}