package BT;

import java.util.*;

class Employee_J05006 {
    String code;
    String name;
    String gender;
    String birth;
    String address;
    String taxCode;
    String signDay;

    public Employee_J05006() {
        this.code = "00001";
        this.name = null;
        this.gender = null;
        this.birth = null;
        this.address = null;
        this.taxCode = null;
        this.signDay = null;
    }

    public Employee_J05006(int stt, String name, String gender, String birth, String address, String taxCode, String signDay) {
        this.code = "";
        int tmp = 5 - String.valueOf(stt).length();
        for(int i = 0; i < tmp; i++) {
            this.code += "0";
        }
        this.code += String.valueOf(stt);
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.taxCode = taxCode;
        this.signDay = signDay;
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.gender + " " + this.birth + " " + this.address + " " + this.taxCode + " " + this.signDay;
    }
}

public class J05006_Danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee_J05006> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String gender = scanner.nextLine();
            String birth = scanner.nextLine();
            String address = scanner.nextLine();
            String taxCode = scanner.nextLine();
            String signDay = scanner.nextLine();
             a.add(new Employee_J05006(i + 1, name, gender, birth, address, taxCode, signDay));
        }
        for(Employee_J05006 i: a) {
            System.out.println(i);
        }
    }
}
