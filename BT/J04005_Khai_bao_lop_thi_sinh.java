package BT;

import java.util.Scanner;
import java.math.*;

class Student_J04005 {
    String name;
    String birth;
    double p1, p2, p3, sum;

    public Student_J04005(String name, String birth, double p1, double p2, double p3) {
        this.name = name;
        this.birth = birth;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sum = p1 + p2 + p3;
    }
    @Override
    public String toString() {
        return this.name + " " + this.birth + " " + String.format("%.1f", this.sum);
    }
}

public class J04005_Khai_bao_lop_thi_sinh {
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
        String birth = scanner.nextLine();
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        double p3 = scanner.nextDouble();
        birth = normalization(birth);
        Student_J04005 a = new Student_J04005(name, birth, p1, p2, p3);
        System.out.println(a);
    }
}
