package BT;
import java.util.*;
import java.util.*;

class Employee_J05038 {
    private String code, name, position;
    private int ngayCong, luongCB, thuong, phuCap, thuNhap;

    public Employee_J05038() {
        this.code = null;
        this.name = null;
        this.position = null;
        this.ngayCong = 0;
        this.luongCB = 0;
        this.thuong = 0;
        this.phuCap = 0;
        this.thuNhap = 0;
    }

    public Employee_J05038(int stt, String name, int luongCB, int ngayCong, String position) {
        this.code = "NV";
        if(stt < 10) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.name = name;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.position = position;
        if(this.position.equals("GD")) {
            this.phuCap = 250000;
        }
        else if(this.position.equals("PGD")) {
            this.phuCap = 200000;
        }
        else if(this.position.equals("TP")) {
            this.phuCap = 180000;
        }
        else if(this.position.equals("NV")) {
            this.phuCap = 150000;
        }
        if(this.ngayCong >= 22 && this.ngayCong < 25) {
            this.thuong = (this.luongCB * this.ngayCong) / 10;
        }
        else if(this.ngayCong >= 25) {
            this.thuong = (this.luongCB * this.ngayCong) / 5;
        }
        else {
            this.thuong = 0;
        }
        this.thuNhap = this.luongCB * this.ngayCong + this.phuCap + this.thuong;
    }

    public int getThuNhap() {
        return this.thuNhap;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.luongCB * this.ngayCong + " " + this.thuong + " " + this.phuCap + " " + this.thuNhap;
    }
}
public class J05038_Bang_ke_tien_luong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee_J05038> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int luongCB = Integer.parseInt(scanner.nextLine());
            int ngayCong = Integer.parseInt(scanner.nextLine());
            String position = scanner.nextLine();
            a.add(new Employee_J05038(i + 1, name, luongCB, ngayCong, position));
        }
        long sum = 0;
        for(Employee_J05038 i: a) {
            System.out.println(i);
            sum += i.getThuNhap();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
