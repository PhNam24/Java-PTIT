package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

class Subject_J07034 implements Comparable<Subject_J07034> {
    String code;
    String name;
    int tinChi;

    public Subject_J07034() {
        this.code = null;
        this.name = null;
        this.tinChi = 0;
    }

    public Subject_J07034(String code, String name, int tinChi) {
        this.code = code;
        this.name = name;
        this.tinChi = tinChi;
    }

    @Override
    public int compareTo(Subject_J07034 Subject_J07034) {
        return this.name.compareTo(Subject_J07034.name);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.tinChi;
    }
}

public class J07034_Danh_sach_mon_hoc {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Subject_J07034[] a = new Subject_J07034[n];
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int tinChi = Integer.parseInt(scanner.nextLine());
            a[i] = new Subject_J07034(code, name, tinChi);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}