package BT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student_J05005 implements Comparable<Student_J05005>{
    private String code, name, birth, lop;
    private double gpa;

    public Student_J05005() {
        this.code = "";
        this.name = "";
        this.birth = "";
        this.lop = "";
        this.gpa = 0;
    }

    public Student_J05005(int stt, String name, String lop, String birth, double gpa) {
        this.code = "B20DCCN";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 3 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }

    @Override
    public int compareTo(Student_J05005 a) {
        if (this.gpa > a.gpa) {
            return -1;
        }
        return 1;
    }
}

public class J05005_Danh_sach_doi_tuong_sinh_vien_3 {
    public static String nameNormalization(String s) {
        s = s.trim().toLowerCase();
        String[] ss = s.split("\\s+");
        String ans = "";
        for(int i = 0; i < ss.length; i++) {
            ans += ss[i].substring(0, 1).toUpperCase() + ss[i].substring(1);
            if(i < ss.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }

    static String birthNormalization(String s) {
        String ans = "";
        String[] ss = s.split("/");
        for(int i = 0; i < ss.length; i++) {
            if(i != 2) {
                int tmp = 2 - ss[i].length();
                for(int j = 0; j < tmp; j++) {
                    ans += "0";
                }
                ans += ss[i] + "/";
            }
            else {
                int tmp = 4 - ss[i].length();
                for(int j = 0; j < tmp; j++) {
                    ans += "0";
                }
                ans += ss[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05005> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            name = nameNormalization(name);
            String lop = scanner.nextLine();
            String birth = scanner.nextLine();
            birth = birthNormalization(birth);
            Double gpa = Double.parseDouble(scanner.nextLine());
            a.add(new Student_J05005(i + 1, name, lop, birth, gpa));
        }
        Collections.sort(a);
        for(Student_J05005 i: a) {
            System.out.println(i);
        }
    }
}
