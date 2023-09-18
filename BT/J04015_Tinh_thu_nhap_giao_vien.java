package BT;

import java.util.Scanner;

class Teacher_J04015 {
    String code;
    String name;
    int level;
    int pc;
    int luongCB;
    int thuNhap;

    public Teacher_J04015(String code, String name, int level, int luongCB) {
        this.code = code;
        this.name = name;
        this.level = level;
        this.luongCB = luongCB;
        if(code.charAt(0) == 'H') {
            if(code.charAt(1) == 'T') {
                this.pc = 2000000;
            }
            else {
                this.pc = 900000;
            }
        }
        else {
            this.pc = 500000;
        }
        this.thuNhap = this.pc + this.luongCB * this.level;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.level + " " + this.pc + " " + this.thuNhap;
    }
}


public class J04015_Tinh_thu_nhap_giao_vien{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        String name = scanner.nextLine();
        int luongCB = scanner.nextInt();
        int level = (code.charAt(2) - '0') * 10 + (code.charAt(3) - '0');
        Teacher_J04015 a = new Teacher_J04015(code, name, level, luongCB);
        System.out.println(a);
    }
}