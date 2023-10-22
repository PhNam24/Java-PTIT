package BT;

import java.util.*;
class Employee_J05060 {
    private String code, name, rank;
    private int age;
    private double lt, th, extra, sum;

    public Employee_J05060() {
        this.code = null;
        this.name = null;
        this.age = 0;
        this.lt = 0;
        this.th = 0;
        this.extra = 0;
        this.sum = 0;
        this.rank = null;
    }

    public Employee_J05060(int stt, String name, int age, double lt, double th) {
        this.code = "PH";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.age = age;
        this.lt = lt;
        this.th = th;
        if(this.lt >= 8 && this.th >= 8) {
            this.extra = 1;
        }
        else if(this.lt >= 7.5  && this.th >= 7.5) {
            this.extra = 0.5;
        }
        else {
            this.extra = 0;
        }
        this.sum = (this.lt + this.th) / 2 + this.extra;
        if(this.sum >= 10) {
            this.sum = 10;
        }
        this.sum = Math.round(this.sum);
        if(this.sum < 5) {
            this.rank = "Truot";
        }
        else if(this.sum <= 6) {
            this.rank = "Trung binh";
        }
        else if(this.sum == 7) {
            this.rank = "Kha";
        }
        else if(this.sum == 8) {
            this.rank = "Gioi";
        }
        else {
            this.rank = "Xuat sac";
        }
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.age + " " + Math.round(this.sum) + " " + this.rank;
    }
}

public class J05060_Ket_qua_xet_tuyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee_J05060> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] birth = scanner.nextLine().split("/");
            int age = 2021 - Integer.parseInt(birth[2]);
            double lt = Double.parseDouble(scanner.nextLine());
            double th = Double.parseDouble(scanner.nextLine());
            a.add(new Employee_J05060(i + 1, name, age, lt, th));
        }
        for(Employee_J05060 i: a) {
            System.out.println(i);
        }
    }
}
