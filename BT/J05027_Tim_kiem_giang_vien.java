package BT;

import java.awt.*;
import java.util.*;

class Teacher_J05027 {
    private String code, name, subject;
    public Teacher_J05027() {
        this.code = null;
        this.name = null;
        this.subject = null;
    }

    public Teacher_J05027(int stt, String name, String subject) {
        this.code = "GV";
        if(stt < 10) {
            this.code += "0" + String.valueOf(stt);
        }
        else {
            this.code += String.valueOf(stt);
        }
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.subject;
    }
}
public class J05027_Tim_kiem_giang_vien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Teacher_J05027> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] s = scanner.nextLine().toUpperCase().split(" ");
            String subject = "";
            for(String j: s) {
                subject += j.charAt(0);
            }
            a.add(new Teacher_J05027(i + 1, name, subject));
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            String query = scanner.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + query + ":");
            query = query.toLowerCase();
            for(Teacher_J05027 i: a) {
                String name = i.getName().toLowerCase();
                if(name.indexOf(query, 0) != -1) {
                    System.out.println(i);
                }
            }
        }
    }
}
