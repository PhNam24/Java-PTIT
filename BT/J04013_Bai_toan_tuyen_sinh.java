package BT;

import java.util.*;

class Student_J04013 {
    private String code;
    private String name;
    private double toan;
    private double ly;
    private double hoa;
    private double extra;
    private double sum;
    private String status;
    public Student_J04013() {
        this.code = null;
        this.name = null;
        this.toan = 0;
        this.ly = 0;
        this.hoa = 0;
        this.extra = 0;
        this.sum = 0;
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
    public Student_J04013(String code, String name, double toan, double ly, double hoa) {
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
        this.sum = this.toan * 2 + this.ly + this.hoa;
        if(this.sum + this.extra >= 24) {
            this.status = "TRUNG TUYEN";
        }
        else {
            this.status = "TRUOT";
        }
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + getExtra() + " " + getSum() + " " + this.status;
    }
}
public class J04013_Bai_toan_tuyen_sinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        String name = scanner.nextLine();
        double toan = scanner.nextDouble();
        double ly = scanner.nextDouble();
        double hoa = scanner.nextDouble();
        Student_J04013 a = new Student_J04013(code, name, toan, ly, hoa);
        System.out.println(a);
    }
}
