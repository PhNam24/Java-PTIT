package BT;

import java.util.*;

class Teacher_J05026 {
    private String code, name, subject;

    public Teacher_J05026() {
        this.code = null;
        this.name = null;
        this.subject = null;
    }

    public Teacher_J05026(int stt, String name, String subject) {
        this.code = "GV";
        if (stt < 10) {
            this.code += "0" + String.valueOf(stt);
        } else {
            this.code += String.valueOf(stt);
        }
        this.name = name;
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.subject;
    }
}
public class J05026_Danh_sach_giang_vien_theo_bo_mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Teacher_J05026> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] s = scanner.nextLine().toUpperCase().split(" ");
            String subject = "";
            for(String j: s) {
                subject += j.charAt(0);
            }
            a.add(new Teacher_J05026(i + 1, name, subject));
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            String[] s = scanner.nextLine().toUpperCase().split(" ");
            String query = "";
            for(String i: s) {
                query += i.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + query + ":");
            for(Teacher_J05026 i: a) {
                if(i.getSubject().equals(query)) {
                    System.out.println(i);
                }
            }
        }
    }
}

