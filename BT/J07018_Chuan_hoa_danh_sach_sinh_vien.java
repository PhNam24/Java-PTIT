package BT;

import java.util.*;
import java.io.*;

class Student_J07018 {
    private String code, name, birth, lop;
    private double gpa;

    public Student_J07018(int stt, String name, String lop, String birth, double gpa) {
        this.code = "B20DCCN";
        if(stt < 10) {
            this.code += "00" + stt;
        }
        else if(stt < 100) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
}
public class J07018_Chuan_hoa_danh_sach_sinh_vien {
    static String nameNorcodelization(String s) {
        String ans = "";
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(int i = 0; i < tmp.length; i++) {
            ans += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1);
            if(i < tmp.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }

    static String birthNocodelization(String s) {
        String ans = "";
        String[] tmp = s.split("/");
        for(int i = 0; i < 3; i++) {
            if(i < 2) {
                if(tmp[i].length() < 2) {
                    ans += "0" +tmp[i];
                }
                else {
                    ans += tmp[i];
                }
                ans += "/";
            }
            else {
                for(int j = 0; j < 4 - tmp[i].length(); j++) {
                    ans += "0";
                }
                ans += tmp[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J07018> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String birth = scanner.nextLine();
            name = nameNorcodelization(name);
            birth = birthNocodelization(birth);
            double gpa = Double.parseDouble(scanner.nextLine());
            a.add(new Student_J07018(i + 1, name, lop, birth, gpa));
        }
        for(Student_J07018 i: a) {
            System.out.println(i);
        }
    }
}
