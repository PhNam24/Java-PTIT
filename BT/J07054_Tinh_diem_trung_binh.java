package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Student_J07054 implements Comparable<Student_J07054> {
    String code;
    String name;
    double oop;
    double cpp;
    double c;
    double avg;
    int rank;
    public Student_J07054() {
        this.code = null;
        this.name = null;
        this.oop = 0;
        this.cpp = 0;
        this.c = 0;
        this.avg = 0;
        this.rank = 0;
    }

    public Student_J07054(int stt, String name, double oop, double cpp, double c) {
        this.code = "SV";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.oop = oop;
        this.cpp = cpp;
        this.c = c;
        this.avg = (this.oop * 3 + this.cpp * 3 + this.c * 2) / 8;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getAvg() {
        return this.avg;
    }

    public int getRank() {
        return this.rank;
    }

    @Override
    public int compareTo(Student_J07054 Student_J07054) {
        if(this.avg > Student_J07054.avg) {
            return -1;
        }
        if(this.avg < Student_J07054.avg) {
            return 1;
        }
        return  0;
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + String.format("%.2f", this.avg) + " " + this.rank;
    }
}

public class J07054_Tinh_diem_trung_binh{
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
        Student_J07054[] a = new Student_J07054[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            name = normalization(name);
            double oop = Double.parseDouble(scanner.nextLine());
            double cpp = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            a[i] = new Student_J07054(i + 1, name, oop, cpp, c);
        }
        Arrays.sort(a);
        a[0].setRank(1);
        System.out.println(a[0]);
        for(int i = 1; i < n; i++) {
            if(a[i].getAvg() == a[i - 1].getAvg()) {
                a[i].setRank(a[i - 1].getRank());
            }
            else {
                a[i].setRank(i + 1);
            }
            System.out.println(a[i]);
        }
    }
}