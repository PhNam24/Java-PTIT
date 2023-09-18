package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Subject_J07058 implements Comparable<Subject_J07058> {
    String code;
    String name;
    String hinhThuc;

    public Subject_J07058() {
        this.code = null;
        this.name = null;
        this.hinhThuc = null;
    }

    public Subject_J07058(String code, String name, String hinhThuc) {
        this.code = code;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public int compareTo(Subject_J07058 Subject_J07058) {
        return this.code.compareTo(Subject_J07058.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.hinhThuc;
    }
}

public class J07058_Danh_sach_mon_thi {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Subject_J07058[] a = new Subject_J07058[n];
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String hinhThuc = scanner.nextLine();
            a[i] = new Subject_J07058(code, name, hinhThuc);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}