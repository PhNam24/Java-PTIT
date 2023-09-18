package BT;

import java.util.*;

class Student_J05003 {
    private String code, name, birth, lop;
    private double gpa;

    public Student_J05003() {
        this.code = "";
        this.name = "";
        this.birth = "";
        this.lop = "";
        this.gpa = 0;
    }

    public Student_J05003(int stt, String name, String lop, String birth, double gpa) {
        this.code = "B20DCCN";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 3 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
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
public class J05003_Danh_sach_doi_tuong_sinh_vien_1 {
    static String birthNormalization(String s) {
        String ans = "";
        String[] ss = s.split("/");
        for(int i = 0; i < ss.length; i++) {
            if(i != 2) {
                int tmp = 2 - ss[i].length();
                for(int j = 0; j < tmp; j++) {
                    ans += "0";
                }
                ans += ss[i] + "/";
            }
            else {
                int tmp = 4 - ss[i].length();
                for(int j = 0; j < tmp; j++) {
                    ans += "0";
                }
                ans += ss[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05003> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String birth = scanner.nextLine();
            birth = birthNormalization(birth);
            Double gpa = Double.parseDouble(scanner.nextLine());
            a.add(new Student_J05003(i + 1, name, lop, birth, gpa));
        }
        for(Student_J05003 i: a) {
            System.out.println(i);
        }
    }
}
