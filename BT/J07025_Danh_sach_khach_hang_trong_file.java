package BT;

import java.util.*;
import java.io.*;

class Customer_J07025 implements Comparable<Customer_J07025> {
    private String code, name, gender, birth, address;

    public Customer_J07025(int stt, String name, String gender, String birth, String address) {
        this.code = "KH";
        if(stt < 10) {
            this.code += "00" + stt;
        }
        else if(stt < 100) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }
    @Override
    public int compareTo(Customer_J07025 a) {
        String[] tmp1 = this.birth.split("/");
        String[] tmp2 = a.birth.split("/");
        int y1 = Integer.parseInt(tmp1[2]);
        int m1 = Integer.parseInt(tmp1[1]);
        int d1 = Integer.parseInt(tmp1[0]);
        int y2 = Integer.parseInt(tmp2[2]);
        int m2 = Integer.parseInt(tmp2[1]);
        int d2 = Integer.parseInt(tmp2[0]);
        if(y1 != y2) {
            return y1 - y2;
        }
        else if(m1 != m2) {
            return m1 - m2;
        }
        return d1 - d2;
    }
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.gender + " " + this.address + " " + this.birth;
    }
}
public class J07025_Danh_sach_khach_hang_trong_file {
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

    static String birthNocodelization(String s) {
        String ans = "";
        String[] tmp = s.split("/");
        for(int i = 0; i < 3; i++) {
            if(i < 2) {
                if(tmp[i].length() < 2) {
                    ans += "0" +tmp[i];
                }
                else {
                    ans += tmp[i];
                }
                ans += "/";
            }
            else {
                for(int j = 0; j < 4 - tmp[i].length(); j++) {
                    ans += "0";
                }
                ans += tmp[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Customer_J07025> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String gender = scanner.nextLine();
            String birth = scanner.nextLine();
            String address = scanner.nextLine();
            name = nameNorcodelization(name);
            birth = birthNocodelization(birth);
            a.add(new Customer_J07025(i + 1, name, gender, birth, address));
        }
        Collections.sort(a);
        for(Customer_J07025 i: a) {
            System.out.println(i);
        }
    }
}
