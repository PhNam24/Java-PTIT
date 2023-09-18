package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Student_J07010 {
    String msv;
    String name;
    String birth;
    String lop;
    double gpa;

    public Student_J07010() {
        this.msv = null;
        this.name = null;
        this.birth = null;
        this.lop = null;
        this.gpa = 0;
    }

    public Student_J07010(int stt, String name, String lop, String birth, double gpa) {
        this.msv = "B20DCCN";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 3 - tmp.length(); i++) {
            this.msv += "0";
        }
        this.msv += tmp;
        this.name = name;
        this.birth = birth;
        this.lop = lop;
        this.gpa = gpa;
    }

    public void in() {
        System.out.printf("%s %s %s %s %.2f\n", this.msv, this.name, this.lop, this.birth, this.gpa);
    }
}



public class J07010_Danh_sach_sinh_vien_trong_file_2 {
    static String normalization(String s) {
        String[] ss = s.split("/");
        String ans = "";
        for(int i = 0; i < ss.length - 1; i++) {
            if(ss[i].length() < 2) {
                ans += "0";
            }
            ans += ss[i] + "/";
        }
        ans += ss[2];
        return ans;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SV.in");
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String birth = scanner.nextLine();
            double gpa = scanner.nextDouble();
            birth = normalization(birth);
            Student_J07010 a = new Student_J07010(i + 1, name, lop, birth, gpa);
            a.in();
            if(i < n - 1) {
                scanner.nextLine();
            }
        }
    }
}
