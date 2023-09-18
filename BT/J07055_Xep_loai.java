package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Student_J07055 implements Comparable<Student_J07055> {
    String code;
    String name;
    double lt;
    double th;
    double thi;
    double avg;
    String rank;
    public Student_J07055() {
        this.code = null;
        this.name = null;
        this.lt = 0;
        this.th = 0;
        this.thi = 0;
        this.avg = 0;
        this.rank = null;
    }

    public Student_J07055(int stt, String name, double lt, double th, double thi) {
        this.code = "SV";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.lt = lt;
        this.th = th;
        this.thi = thi;
        this.avg = this.lt * 0.25 + this.th * 0.35 + this.thi * 0.4;
        if(this.avg < 5) {
            this.rank = "KEM";
        }
        else if(this.avg < 6.5) {
            this.rank = "TRUNG BINH";
        }
        else if(this.avg < 8) {
            this.rank = "KHA";
        }
        else {
            this.rank = "GIOI";
        }
    }

    @Override
    public int compareTo(Student_J07055 Student_J07055) {
        if(this.avg > Student_J07055.avg) {
            return -1;
        }
        if(this.avg < Student_J07055.avg) {
            return 1;
        }
        return  0;
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + String.format("%.2f", this.avg) + " " + this.rank;
    }
}

public class J07055_Xep_loai {
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
        Scanner scanner = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Student_J07055[] a = new Student_J07055[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            name = normalization(name);
            double lt = Double.parseDouble(scanner.nextLine());
            double th = Double.parseDouble(scanner.nextLine());
            double thi = Double.parseDouble(scanner.nextLine());
            a[i] = new Student_J07055(i + 1, name, lt, th, thi);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}