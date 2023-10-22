package BT;

import java.util.*;
class Student_J05057 {
    String code;
    String name;
    double toan;
    double ly;
    double hoa;
    double extra;
    double sum;
    String status;

    public Student_J05057() {
        this.code = null;
        this.name = null;
        this.toan = 0;
        this.ly = 0;
        this.hoa = 0;
        this.extra = 0;
        this.sum = 0;
    }

    public String getExtra() {
        if (this.extra == (int) this.extra) {
            return String.valueOf((int) this.extra);
        }
        return String.format("%.1f", this.extra);
    }

    public String getSum() {
        if (this.sum == (int) this.sum) {
            return String.valueOf((int) this.sum);
        }
        return String.format("%.1f", this.sum);
    }

    public Student_J05057(String code, String name, double toan, double ly, double hoa) {
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if (this.code.substring(0, 3).equals("KV1")) {
            this.extra = 0.5;
        }
        else if (this.code.substring(0, 3).equals("KV2")) {
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
public class J05057_Bang_diem_tuyen_sinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05057> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            double toan = Double.parseDouble(scanner.nextLine());
            double ly = Double.parseDouble(scanner.nextLine());
            double hoa = Double.parseDouble(scanner.nextLine());
            a.add(new Student_J05057(code, name, toan, ly, hoa));
        }
        for(Student_J05057 i: a) {
            System.out.println(i);
        }
    }
}

