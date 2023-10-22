package BT;

import java.util.*;

class Student_J05021 implements Comparable<Student_J05021>{
    private String code, name, lop, email;

    public Student_J05021() {
        this.code = null;
        this.name = null;
        this.lop = null;
        this.email = null;
    }

    public Student_J05021(String code, String name, String lop, String email) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(Student_J05021 a) {
        return this.code.compareTo(a.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.email;
    }
}

public class J05021_Sap_xep_theo_ma_sinh_vien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student_J05021> a = new ArrayList<>();
        while(scanner.hasNextLine()){
            String code = scanner.nextLine();
            if(code.isEmpty()) {
                break;
            }
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            a.add(new Student_J05021(code, name, lop, email));
        }
        Collections.sort(a);
        for(Student_J05021 i: a) {
            System.out.println(i);
        }
    }
}
