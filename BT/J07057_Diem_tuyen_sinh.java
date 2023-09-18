package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Student_J07057 implements Comparable<Student_J07057> {
    String code;
    String name;
    String danToc;
    double diem;
    int khuVuc;
    double extra;
    double sum;
    String result;
    public Student_J07057() {
        this.code = null;
        this.name = null;
        this.danToc = null;
        this.diem = 0;
        this.khuVuc = 0;
        this.extra = 0;
        this.sum = 0;
        this.result = null;
    }

    public Student_J07057(int stt, String name, double diem, String danToc, int khuVuc) {
        this.code = "TS";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.diem = diem;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        if(khuVuc == 1) {
            this.extra = 1.5;
        }
        else if(khuVuc == 2) {
            this.extra = 1;
        }
        else {
            this.extra = 0;
        }
        if(!this.danToc.equals("Kinh")) {
            this.extra += 1.5;
        }
        this.sum = this.diem + this.extra;
        if(this.sum >= 20.5) {
            this.result = "Do";
        }
        else {
            this.result = "Truot";
        }
    }

    @Override
    public int compareTo(Student_J07057 Student_J07057) {
        if(this.sum != Student_J07057.sum) {
            if(this.sum > Student_J07057.sum) {
                return -1;
            }
            else return 1;
        }
        return this.code.compareTo(Student_J07057.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + String.format("%.1f", this.sum) + " " + this.result;
    }
}

public class J07057_Diem_tuyen_sinh {
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
        Student_J07057[] a = new Student_J07057[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            name = normalization(name);
            double diem = Double.parseDouble(scanner.nextLine());
            String danToc = scanner.nextLine();
            int khuVuc = Integer.parseInt(scanner.nextLine());
            a[i] = new Student_J07057(i + 1, name, diem, danToc, khuVuc);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
