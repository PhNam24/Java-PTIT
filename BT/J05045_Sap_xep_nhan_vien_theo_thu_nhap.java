package BT;

import java.util.*;

class Employee_J05045 implements Comparable<Employee_J05045> {
    private String code, name, position;
    private double ngayCong, luongCB, tamUng, phuCap, conLai, luongChinh, thuNhap;

    public Employee_J05045() {
        this.code = null;
        this.name = null;
        this.position = null;
        this.ngayCong = 0;
        this.luongCB = 0;
        this.tamUng = 0;
        this.phuCap = 0;
        this.conLai = 0;
        this.luongChinh = 0;
        this.thuNhap = 0;
    }

    public Employee_J05045(int stt, String name, String position, int luongCB, int ngayCong) {
        this.code = "NV";
        if(stt < 10) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.name = name;
        this.position = position;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        if(this.position.equals("GD")) {
            this.phuCap = 500;
        }
        else if(this.position.equals("PGD")) {
            this.phuCap = 400;
        }
        else if(this.position.equals("TP")) {
            this.phuCap = 300;
        }
        else if(this.position.equals("KT")) {
            this.phuCap = 250;
        }
        else {
            this.phuCap = 100;
        }
        this.luongChinh = this.luongCB * this.ngayCong;
        if((this.phuCap + this.luongChinh) * 2 / 3 < 25000) {
            this.tamUng = Math.round((this.phuCap + this.luongChinh) * 2 / 3000) * 1000;
        }
        else {
            this.tamUng = 25000;
        }
        this.conLai = this.luongChinh - this.tamUng + phuCap;
        this.thuNhap = this.luongChinh + this.phuCap;
    }

    public String getPosition() {
        return this.position;
    }

    @Override
    public int compareTo(Employee_J05045 a) {
        if(this.thuNhap != a.thuNhap) {
            return -(int)(this.thuNhap - a.thuNhap);
        }
        return this.code.compareTo(a.code);
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + Math.round(this.phuCap) + " " + Math.round(this.luongChinh) + " " + Math.round(this.tamUng / 1000) * 1000 + " " + Math.round(this.conLai);
    }
}

public class J05045_Sap_xep_nhan_vien_theo_thu_nhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee_J05045> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String position = scanner.nextLine();
            int luongCB = Integer.parseInt(scanner.nextLine());
            int ngayCong = Integer.parseInt(scanner.nextLine());
            a.add(new Employee_J05045(i + 1, name, position, luongCB, ngayCong));
        }
        Collections.sort(a);
        for(Employee_J05045 i: a) {
           System.out.println(i);
        }
    }
}
