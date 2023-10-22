package BT;

import java.util.*;

class Student_J05042 implements Comparable<Student_J05042> {
    private String name;
    private int AC, submit;
    public Student_J05042(String name, int AC, int submit) {
        this.name = name;
        this.AC = AC;
        this.submit = submit;
    }

    @Override
    public int compareTo(Student_J05042 a) {
        if(this.AC != a.AC) {
            return -(this.AC - a.AC);
        }
        else if(this.submit != a.submit) {
            return this.submit - a.submit;
        }
        return this.name.compareTo(a.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.AC + " " + this.submit;
    }
}
public class J05042_Bang_xep_hang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05042> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int AC = scanner.nextInt();
            int submit = scanner.nextInt();
            if(i < n - 1) {
                scanner.nextLine();
            }
            a.add(new Student_J05042(name, AC, submit));
        }
        Collections.sort(a);
        for(Student_J05042 i: a) {
            System.out.println(i);
        }
    }
}
