package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Customer_J07051 implements Comparable<Customer_J07051> {
    String code;
    String name;
    String room;
    String arrive;
    String leave;
    long stay;
    long fee;
    long pay;
    public Customer_J07051() {
        this.code = null;
        this.name = null;
        this.room = null;
        this.arrive = null;
        this.leave = null;
        this.stay = 0;
        this.fee = 0;
        this.pay = 0;
    }
    public long getPrice() {
        if(this.room.charAt(0) == '1') {
            return 25;
        }
        if(this.room.charAt(0) == '2') {
            return 34;
        }if(this.room.charAt(0) == '3') {
            return 50;
        }
        return 80;
    }
    public Customer_J07051(int stt, String name, String room, String arrive, String leave, long stay, long fee) {
        this.code = "KH";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.room = room;
        this.arrive = arrive;
        this.leave = leave;
        this.stay = stay;
        this.fee = fee;
        this.pay = this.fee + this.stay * getPrice();
    }

    @Override
    public int compareTo(Customer_J07051 Customer_J07051) {
        long ans = this.pay - Customer_J07051.pay;
        return (int)-ans;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.room + " " + this.stay + " " + this.pay;
    }
}

public class J07051_Tinh_tien_phong {
    public static String normalization(String ss) {
        String[] s = ss.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(int i = 0; i < s.length; i++) {
            ans += s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
            if(i < s.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("KHACHHANG.in"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(scanner.nextLine());
        Customer_J07051[] a = new Customer_J07051[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            name = normalization(name);
            String room = scanner.nextLine();
            String arrive = scanner.nextLine();
            String leave = scanner.nextLine();
            Date firstDay = simpleDateFormat.parse(arrive);
            Date lastDay = simpleDateFormat.parse(leave);
            long fee = Long.parseLong(scanner.nextLine());
            long stay = (lastDay.getTime() - firstDay.getTime()) / (long)(1000 * 60 * 60 * 24) + 1;
            a[i] = new Customer_J07051(i + 1, name, room, arrive, leave, stay, fee);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}