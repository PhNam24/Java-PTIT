package BT;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Student_J07033 implements Comparable<Student_J07033> {
    String code;
    String name;
    String lop;
    String email;

    public Student_J07033() {
        this.code = null;
        this.name = null;
        this.lop = null;
        this.email = null;
    }

    public Student_J07033(String code, String name, String lop, String email) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(Student_J07033 Student_J07033) {
        return this.code.compareTo(Student_J07033.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.email;
    }
}

public class J07033_Danh_sach_sinh_vien_trong_File_1 {
    public static String normalization(String s) {
        s = s.trim().toLowerCase();
        String[] ss = s.split("\\s+");
        String ans = "";
        for(int i = 0; i < ss.length; i++) {
            ans += ss[i].substring(0, 1).toUpperCase() + ss[i].substring(1);
            if(i < ss.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Student_J07033[] a = new Student_J07033[n];
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            name = normalization(name);
            a[i] = new Student_J07033(code, name, lop, email);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}