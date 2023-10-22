package TH.TH2;

import java.util.*;
import java.io.*;

class Student_G implements Comparable<Student_G> {
    private String msv, ten, lop, email, sdt;

    public Student_G(String msv, String ten, String lop, String email, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    @Override
    public int compareTo(Student_G a) {
        if(!this.lop.equals(a.lop)) {
            return this.lop.compareTo(a.lop);
        }
        return this.msv.compareTo(a.msv);
    }

    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.email + " " + this.sdt;
    }
}

public class G_Danh_sach_lien_lac {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student_G> a = new ArrayList<>();
        ArrayList<String> input = new ArrayList<>();
        while(scanner.hasNextLine()) {
            input.add(scanner.nextLine());
            if(input.size() == 5) {
                a.add(new Student_G(input.get(0), input.get(1), input.get(2), input.get(3), input.get(4)));
                input.clear();
            }
        }
        Collections.sort(a);
        for(Student_G i: a) {
            System.out.println(i);
        }
    }
}
