package BT;

import java.util.*;
import java.io.*;

class Company_J07038 {
    private String code, name;
    private int soLuong;
    public Company_J07038(String code, String name, int soLuong) {
        this.code = code;
        this.name = name;
        this.soLuong = soLuong;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}

class Student_J07038 implements Comparable<Student_J07038> {
    private String code, name, lop, email;
    private Company_J07038 company;
    public Student_J07038(String code, String name, String lop, String email) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.company = null;
    }

    public void setCompany(Company_J07038 company) {
        this.company = company;
    }

    public String getCode() {
        return this.code;
    }

    public Company_J07038 getCompany() {
        return this.company;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.lop;
    }
    public int compareTo(Student_J07038 a) {
        return this.code.compareTo(a.code);
    }
}

public class J07038_Danh_sach_thuc_tap_3 {
    static String nameNorcodelization(String s) {
        String ans = "";
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(int i = 0; i < tmp.length; i++) {
            ans += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1);
            if(i < tmp.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("BT/InputFile/SINHVIEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J07038> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = nameNorcodelization(scanner.nextLine());
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            a.add(new Student_J07038(code, name, lop, email));
        }
        Collections.sort(a);
        scanner = new Scanner(new File("BT/InputFile/DN.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<Company_J07038> b = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            map.put(code, name);
            int soLuong = Integer.parseInt(scanner.nextLine());
            b.add(new Company_J07038(code, name, soLuong));
        }
        scanner = new Scanner(new File("BT/InputFile/THUCTAP.in"));
        n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String code = "";
            for(int j = 1; j < input.length; j++) {
                code += input[j];
                if(j < input.length - 1) {
                    code += " ";
                }
            }
            for(Student_J07038 j: a) {
                boolean check = false;
                if(j.getCode().equals(input[0])) {
                    for(Company_J07038 k: b) {
                        if(k.getCode().equals(code) && k.getSoLuong() > 0) {
                            k.setSoLuong(k.getSoLuong() - 1);
                            j.setCompany(k);
                            check = true;
                            break;
                        }
                    }
                    if(check) {
                        break;
                    }
                }
            }
        }
        n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            System.out.println("DANH SACH THUC TAP TAI " + map.get(input) + ":");
            for(Student_J07038 j: a) {
                if(j.getCompany() != null && j.getCompany().getCode().equals(input)) {
                    System.out.println(j);
                }
            }
        }
    }
}
