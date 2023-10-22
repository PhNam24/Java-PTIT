package BT;

import java.util.*;

class Student_J05020 implements Comparable<Student_J05020>{
    private String code, name, lop, email;

    public Student_J05020() {
        this.code = null;
        this.name = null;
        this.lop = null;
        this.email = null;
    }

    public Student_J05020(String code, String name, String lop, String email) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(Student_J05020 a) {
        if(!this.lop.equals(a.lop)) {
            return this.lop.compareTo(a.lop);
        }
        return this.code.compareTo(a.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.email;
    }
}
public class J05020_Sap_xep_sinh_vien_theo_lop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05020> a = new ArrayList<>();
        for(int i =0 ; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            a.add(new Student_J05020(code, name, lop, email));
        }
        Collections.sort(a);
        for(Student_J05020 i: a) {
            System.out.println(i);
        }
    }
}
