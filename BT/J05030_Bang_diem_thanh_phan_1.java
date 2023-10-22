package BT;

import java.util.*;

class Student_J05030 implements Comparable<Student_J05030>{
    private String code, name, lop;
    private double p1, p2, p3;

    public Student_J05030() {
        this.code = null;
        this.name = null;
        this.lop = null;
        this.p1 = 0;
        this.p2 = 0;
        this.p3 = 0;
    }

    public Student_J05030(String code, String name, String lop, double p1, double p2, double p3) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int compareTo(Student_J05030 a) {
        return this.code.compareTo(a.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + String.format("%.1f", this.p1) + " " + String.format("%.1f", this.p2) + " " + String.format("%.1f", this.p3);
    }
}
public class J05030_Bang_diem_thanh_phan_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05030> a = new ArrayList<>();
        for(int i = 0 ;i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            double p1 = Double.parseDouble(scanner.nextLine());
            double p2 = Double.parseDouble(scanner.nextLine());
            double p3 = Double.parseDouble(scanner.nextLine());
            a.add(new Student_J05030(code, name, lop, p1, p2, p3));
        }
        Collections.sort(a);
        int stt = 1;
        for(Student_J05030 i: a) {
            System.out.print(stt++ + " ");
            System.out.println(i);
        }
    }
}
