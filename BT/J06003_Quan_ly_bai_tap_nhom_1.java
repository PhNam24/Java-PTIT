package BT;

import java.util.*;

class Student_J06003 {
    private String code, name, sdt, topic;
    private int group;

    public Student_J06003(String code, String name, String sdt, int group) {
        this.code = code;
        this.name = name;
        this.sdt = sdt;
        this.group = group;
        this.topic = "";
    }

    public int getGroup() {
        return this.group;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " +  this.sdt;
    }
}

public class J06003_Quan_ly_bai_tap_nhom_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Student_J06003> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String sdt = scanner.nextLine();
            int group = Integer.parseInt(scanner.nextLine());
            a.add(new Student_J06003(code, name, sdt, group));
        }
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < m; i++) {
            String topic = scanner.nextLine();
            map.put(i + 1, topic);
            for(Student_J06003 j: a) {
                if(j.getGroup() == i + 1) {
                    j.setTopic(topic);
                }
            }
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-- > 0) {
            int gr = scanner.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", gr);
            for(Student_J06003 i: a) {
                if(i.getGroup() == gr) {
                    System.out.println(i);
                }
            }
            System.out.println("Bai tap dang ky: " + map.get(gr));
        }
    }
}
