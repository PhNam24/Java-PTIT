package BT;


import java.util.*;

class Student_J05023 {
    private String code, name, lop, email;

    public Student_J05023() {
        this.code = null;
        this.name = null;
        this.lop = null;
        this.email = null;
    }

    public Student_J05023(String code, String name, String lop, String email) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getYear() {
        return this.lop.substring(1, 3);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.email;
    }
}
public class J05023_Liet_ke_sinh_vien_theo_khoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05023> a = new ArrayList<>();
        for(int i =0 ; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            a.add(new Student_J05023(code, name, lop, email));
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            String year = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for(Student_J05023 i: a) {
                if(i.getYear().equals(year.substring(2))) {
                    System.out.println(i);
                }
            }
        }
    }
}
