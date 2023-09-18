package BT;

import java.util.Scanner;

class Employee_J04007 {
    String code;
    String name;
    String gender;
    String birth;
    String address;
    String taxCode;
    String signDay;

    public Employee_J04007() {
        this.code = "00001";
        this.name = null;
        this.gender = null;
        this.birth = null;
        this.address = null;
        this.taxCode = null;
        this.signDay = null;
    }

    public Employee_J04007(String name, String gender, String birth, String address, String taxCode, String signDay) {
        this.code = "00001";
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

public class J04007_Khai_bao_lop_nhan_vien{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String gender = scanner.nextLine();
        String birth = scanner.nextLine();
        String address = scanner.nextLine();
        String taxCode = scanner.nextLine();
        String signDay = scanner.nextLine();
        Employee_J04007 a = new Employee_J04007(name, gender, birth, address, taxCode, signDay);
        System.out.println(a);
    }
}
