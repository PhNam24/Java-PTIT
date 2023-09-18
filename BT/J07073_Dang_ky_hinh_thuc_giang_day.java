package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Subject_J07073 implements Comparable<Subject_J07073> {
    String code;
    String name;
    int tinChi;
    String lt;
    String th;

    public Subject_J07073() {
        this.code = null;
        this.name = null;
        this.tinChi = 0;
        this.lt = null;
        this.th = null;
    }

    public Subject_J07073(String code, String name, int tinChi, String lt, String th) {
        this.code = code;
        this.name = name;
        this.tinChi = tinChi;
        this.lt = lt;
        this.th = th;
    }

    @Override
    public int compareTo(Subject_J07073 Subject_J07073) {
        return this.code.compareTo(Subject_J07073.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.tinChi + " " + this.lt + " " + this.th;
    }
}

public class J07073_Dang_ky_hinh_thuc_giang_day {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Subject_J07073> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int tinChi = Integer.parseInt(scanner.nextLine());
            String lt = scanner.nextLine();
            String th = scanner.nextLine();
            if(!th.equals("Truc tiep")) {
                a.add(new Subject_J07073(code, name, tinChi, lt, th));
            }
        }
        Collections.sort(a);
        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
