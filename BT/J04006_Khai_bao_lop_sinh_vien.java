package BT;

import java.util.Scanner;

class Student_J04006 {
    String name;
    String birth;
    String lop;
    double gpa;

    public Student_J04006() {
        this.name = null;
        this.birth = null;
        this.lop = null;
        this.gpa = 0;
    }

    public Student_J04006(String name, String birth, String lop, double gpa) {
        this.name = name;
        this.birth = birth;
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "B20DCCN001 " + this.name + " " + this.lop + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
}

public class J04006_Khai_bao_lop_sinh_vien{
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lop = scanner.nextLine();
        String birth = scanner.nextLine();
        double gpa = scanner.nextDouble();
        birth = normalization(birth);
        Student_J04006 a = new Student_J04006(name, birth, lop, gpa);
        System.out.println(a);
    }
}