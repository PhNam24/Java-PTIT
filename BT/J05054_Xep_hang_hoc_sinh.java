package BT;

import java.util.*;

class Student_J05054 implements Comparable<Student_J05054> {
    private String code, name, rank;
    private int xepHang;
    private double diem;

    public Student_J05054(int stt, String name, double diem) {
        this.code = "HS";
        if(stt < 10) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.name = name;
        this.diem = diem;
        if(this.diem >= 9) {
            this.rank = "Gioi";
        }
        else if(this.diem >= 7) {
            this.rank = "Kha";
        }
        else if(this.diem >= 5) {
            this.rank = "Trung Binh";
        }
        else {
            this.rank = "Yeu";
        }
        this.xepHang = 0;
    }

    public double getDiem() {
        return this.diem;
    }

    public int getXepHang() {
        return this.xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public int compareTo(Student_J05054 a) {
        if(this.diem != a.diem) {
            if(this.diem > a.diem) {
                return -1;
            }
            else {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + String.format("%.1f", this.diem) + " " + this.rank + " " + this.xepHang;
    }
}
public class J05054_Xep_hang_hoc_sinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05054> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double diem = Double.parseDouble(scanner.nextLine());
            a.add(new Student_J05054(i + 1, name, diem));
        }
        ArrayList<Student_J05054> b = new ArrayList<>(a);
        Collections.sort(b);
        b.get(0).setXepHang(1);
        boolean check = false;
        int xepHang = 2;
        for(int i = 1; i < n; i++) {
            if(b.get(i).getDiem() == b.get(i - 1).getDiem()) {
                b.get(i).setXepHang(b.get(i - 1).getXepHang());
            }
            else {
                b.get(i).setXepHang(i + 1);
            }
        }
        for(Student_J05054 i: a) {
            for(Student_J05054 j: b) {
                if(i.getCode().equals(j.getCode())) {
                    i.setXepHang(j.getXepHang());
                    break;
                }
            }
        }
        for(Student_J05054 i: a) {
            System.out.println(i);
        }
    }
}

