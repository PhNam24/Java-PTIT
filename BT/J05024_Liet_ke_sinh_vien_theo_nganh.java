package BT;

import java.util.ArrayList;
import java.util.Scanner;

class Student_J05024 {
    private String code, name, lop, email;

    public Student_J05024() {
        this.code = null;
        this.name = null;
        this.lop = null;
        this.email = null;
    }

    public Student_J05024(String code, String name, String lop, String email) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getNganh() {
        return this.code.substring(5, 7);
    }

    public char getLop() {
        return this.lop.charAt(0);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.email;
    }
}
public class J05024_Liet_ke_sinh_vien_theo_nganh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05024> a = new ArrayList<>();
        for(int i =0 ; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            a.add(new Student_J05024(code, name, lop, email));
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            String nganh = scanner.nextLine().toUpperCase();
            String[] tmp = nganh.split(" ");
            String kh = "";
            for(int i = 0; i < 2; i++) {
                kh += tmp[i].charAt(0);
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
            for(Student_J05024 i: a) {
                if(i.getNganh().equals(kh)) {
                    if((kh.equals("AT") || kh.equals("CN"))) {
                        if(i.getLop() != 'E') {
                            System.out.println(i);
                        }
                    }
                    else {
                        System.out.println(i);
                    }
                }

            }
        }
    }
}
