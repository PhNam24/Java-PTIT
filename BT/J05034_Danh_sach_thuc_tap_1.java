package BT;

import java.util.*;

class Student_J05034 implements Comparable<Student_J05034>{
    private int stt;
    private String code, name, lop, email, company;

    public Student_J05034() {
        this.stt = 0;
        this.code = null;
        this.name = null;
        this.lop = null;
        this.email = null;
        this.company = null;
    }

    public Student_J05034(int stt, String code, String name, String lop, String email, String company) {
        this.stt = stt;
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    @Override
    public int compareTo(Student_J05034 a) {
        return this.name.compareTo(a.name);
    }

    @Override
    public String toString() {
        return this.stt + " " + this.code + " " + this.name + " " + this.lop + " " + this.email + " " + this.company;
    }
}
public class J05034_Danh_sach_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05034> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            String company = scanner.nextLine();
            a.add(new Student_J05034(i + 1, code, name, lop, email, company));
        }
        Collections.sort(a);
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            String query = scanner.nextLine();
            for(Student_J05034 i: a) {
                if(i.getCompany().equals(query)) {
                    System.out.println(i);
                }
            }
        }
    }
}
