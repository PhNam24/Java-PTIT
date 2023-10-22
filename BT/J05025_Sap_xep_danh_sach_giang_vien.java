package BT;

import java.util.*;

class Teacher_J05025 implements Comparable<Teacher_J05025>{
    private String code, name, subject;
    public Teacher_J05025() {
        this.code = null;
        this.name = null;
        this.subject = null;
    }

    public Teacher_J05025(int stt, String name, String subject) {
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

    @Override
    public int compareTo(Teacher_J05025 a) {
        String[] ten1 = this.name.split(" ");
        String[] ten2 = a.name.split(" ");
        if(!ten1[ten1.length - 1].equals(ten2[ten2.length - 1])) {
            return ten1[ten1.length - 1].compareTo(ten2[ten2.length - 1]);
        }
        return this.code.compareTo(a.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.subject;
    }
}

public class J05025_Sap_xep_danh_sach_giang_vien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Teacher_J05025> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] s = scanner.nextLine().toUpperCase().split(" ");
            String subject = "";
            for(String j: s) {
                subject += j.charAt(0);
            }
            a.add(new Teacher_J05025(i + 1, name, subject));
        }
        Collections.sort(a);
        for(Teacher_J05025 i: a) {
            System.out.println(i);
        }
    }
}
