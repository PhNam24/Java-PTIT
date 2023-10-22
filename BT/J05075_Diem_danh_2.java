package BT;

import java.util.*;

class Student_J05075 {
    private String code, name, lop, status;
    private int diem;
    public Student_J05075(String code, String name, String lop) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.status = "";
        this.diem = 10;
    }

    public int getDiem() {
        return this.diem;
    }

    public String getCode() {
        return this.code;
    }

    public String getLop() {
        return this.lop;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop + " " + this.diem + " " + this.status;
    }
}
public class J05075_Diem_danh_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05075> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            a.add(new Student_J05075(code, name, lop));
        }
        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String code = input[0];
            String dd = input[1];
            for(Student_J05075 j: a) {
                if(j.getCode().equals(code)) {
                    for(int k = 0; k < dd.length(); k++) {
                        if(dd.charAt(k) == 'v') {
                            j.setDiem(j.getDiem() - 2);
                        }
                        else if(dd.charAt(k) == 'm') {
                            j.setDiem(j.getDiem() - 1);
                        }
                    }
                    if(j.getDiem() <= 0) {
                        j.setDiem(0);
                        j.setStatus("KDDK");
                    }
                    break;
                }
            }
        }
        String lop = scanner.nextLine();
        for(Student_J05075 i: a) {
            if(i.getLop().equals(lop)) {
                System.out.println(i);
            }
        }
    }
}
