package BT;

import java.util.*;

class Subject_J05080 implements Comparable<Subject_J05080> {
    private String code, name, group, teacher;

    public Subject_J05080 (String code, String name, String group, String teacher) {
        this.code = code;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }

    public String getTeacher() {
        return this.teacher;
    }

    @Override
    public int compareTo(Subject_J05080 a) {
        if(!this.code.equals(a.code)) {
            return this.code.compareTo(a.code);
        }
        return this.group.compareTo(a.group);
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.group;
    }
}

public class J05080_Lop_hoc_phan_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Subject_J05080> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String group = scanner.nextLine();
            String teacher = scanner.nextLine();
            a.add(new Subject_J05080(code, name, group, teacher));
        }
        Collections.sort(a);
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            String query = scanner.nextLine();
            System.out.println("Danh sach cho giang vien " + query + ":");
            for(Subject_J05080 i: a) {
                if(i.getTeacher().equals(query)) {
                    System.out.println(i);
                }
            }
        }
    }
}
