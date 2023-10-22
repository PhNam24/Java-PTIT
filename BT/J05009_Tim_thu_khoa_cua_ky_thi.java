package BT;

import java.util.*;

class Student_J05007 {
    int stt;
    private String name, birth;
    private double p1, p2, p3, sum;
    public Student_J05007 () {
        this.stt = 0;
        this.name = null;
        this.birth = null;
        this.p1 = 0;
        this.p2 = 0;
        this.p3 = 0;
        this.sum = 0;
    }

    public Student_J05007(int stt, String name, String birth, double p1, double p2, double p3) {
        this.stt = stt;
        this.name = name;
        this.birth = birth;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sum = this.p1 + this.p2 + this.p3;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return this.stt + " " + this.name + " " + this.birth + " " + this.sum;
    }
}
public class J05009_Tim_thu_khoa_cua_ky_thi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double pMax = 0;
        ArrayList<Student_J05007> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String birth = scanner.nextLine();
            double p1 = Double.parseDouble(scanner.nextLine());
            double p2 = Double.parseDouble(scanner.nextLine());
            double p3 = Double.parseDouble(scanner.nextLine());
            a.add(new Student_J05007(i + 1, name, birth, p1, p2, p3));
            pMax = Math.max(pMax, p1 + p2 + p3);
        }
        for(Student_J05007 i: a) {
            if(i.getSum() == pMax) {
                System.out.println(i);
            }
        }
    }
}
