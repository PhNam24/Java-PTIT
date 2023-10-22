package BT;

import java.util.*;

class Subject_J05079 implements Comparable<Subject_J05079> {
    private String code, name, group, teacher;

    public Subject_J05079 (String code, String name, String group, String teacher) {
        this.code = code;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public int compareTo(Subject_J05079 a) {
        return this.group.compareTo(a.group);
    }
    @Override
    public String toString() {
        return this.group + " " + this.teacher;
    }
}
public class J05079_Lop_hoc_phan_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> map = new HashMap<>();
        ArrayList<Subject_J05079> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String group = scanner.nextLine();
            String teacher = scanner.nextLine();
            if(!a.contains(code)) {
                map.put(code, name);
            }
            a.add(new Subject_J05079(code, name, group, teacher));
        }
        Collections.sort(a);
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            String query = scanner.nextLine();
            System.out.println("Danh sach nhom lop mon " + map.get(query) + ":");
            for(Subject_J05079 i: a) {
                if(i.getCode().equals(query)) {
                    System.out.println(i);
                }
            }
        }
    }
}
